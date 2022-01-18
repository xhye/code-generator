package ${package.Entity}.dto

<#if swagger2>
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
</#if>
import ${package.Entity}.entity.${entity}

/**
* ${table.comment!} DTO 用于新增和修改传参
*
* (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
* Created by ${author} on ${date}.
* @author ${author}
* @since 1.0
*/

<#if swagger2>
@ApiModel(value="${entity}AddOrUpdateDTO", description="${table.comment!}")
</#if>
<#if kotlin>
data class ${entity}AddOrUpdateDTO(
    @ApiModelProperty(value = "示例")
    var example: String? = null
) : ${entity}()
<#else>
public class ${entity}AddOrUpdateDTO extends ${entity} {
    @ApiModelProperty(value = "示例")
    private String example;
}
</#if>