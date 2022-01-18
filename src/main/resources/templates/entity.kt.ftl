package ${package.Entity}

<#list table.importPackages as pkg>
import ${pkg}
</#list>
<#if swagger2>
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
</#if>

/**
* ${table.name!}(${table.comment!}) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
*
*   ## 以下四个字段在新增和修改的时候会自动填充(需要引入配置)（当前时间和当前登录用户，所以设计表的时候要对应上
*   val createTime = TableFill("create_time", FieldFill.INSERT)
*   val updateName = TableFill("update_time", FieldFill.UPDATE)
*   val createUserId = TableFill("create_user_id", FieldFill.INSERT)
*   val updateUserId = TableFill("update_user_id", FieldFill.UPDATE)
*
*  注意(如果主键是雪花主键)：由于雪花主键过长，返回前端需要转成String,可配置@JsonSerialize(using = ToStringSerializer::class)或者配置全局Long转String
*  (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
*
*  Created by ${author} on ${date}.
*  @author ${author}
*  @since 1.0
*/
<#if table.convert>
@TableName("${table.name}")
</#if>
<#if swagger2>
@ApiModel(value="${entity}对象", description="${table.comment!}")
</#if>
<#if superEntityClass??>
class ${entity} : ${superEntityClass}<#if activeRecord><${entity}></#if> {
<#elseif activeRecord>
class ${entity} : Model<${entity}>() {
<#else>
open class ${entity} : Serializable {
</#if>
<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>
<#if field.keyFlag>
    <#assign keyPropertyName="${field.propertyName}"/>
</#if>
<#if field.comment!?length gt 0>
<#if swagger2>
  @ApiModelProperty(value = "${field.comment}")
<#else>
  /**
   * ${field.comment}
   */
</#if>
</#if>
<#if field.keyFlag>
<#-- 主键 -->
<#if idType ??>
  @TableId(value = "${field.annotationColumnName}", type = IdType.${idType})
<#elseif field.keyIdentityFlag>
  @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
<#elseif field.convert>
  @TableId("${field.annotationColumnName}")
</#if>
<#-- 普通字段 -->
<#elseif field.fill??>
<#-- -----   存在字段填充设置   ----->
<#if field.convert>
  @TableField(value = "${field.annotationColumnName}", fill = FieldFill.${field.fill})
<#else>
  @TableField(fill = FieldFill.${field.fill})
</#if>
<#elseif field.convert>
  @TableField("${field.annotationColumnName}")
</#if>
<#-- 乐观锁注解 -->
<#if (versionFieldName!"") == field.name>
  @Version
</#if>
<#-- 逻辑删除注解 -->
<#if (logicDeleteFieldName!"") == field.name>
  @TableLogic
</#if>
    <#if field.propertyType == "Integer">
  var ${field.propertyName}: Int? = null
    <#else>
  var ${field.propertyName}: ${field.propertyType}? = null
    </#if>
</#list>

<#-- ----------  END 字段循环遍历  ---------->
<#if entityColumnConstant>
    companion object {
<#list table.fields as field>
        const val ${field.name?upper_case} : String = "${field.name}"
</#list>
    }
</#if>
<#if activeRecord>
    override fun pkVal(): Serializable? {
<#if keyPropertyName??>
      return ${keyPropertyName}
<#else>
      return null
</#if>
    }
</#if>
}
