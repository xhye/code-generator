package com.aegis.modules.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
*  t_sys_function(系统模块或者方法) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
*
*   ## 以下四个字段在新增和修改的时候会自动填充（需要引入配置）（当前时间和当前登录用户，所以设计表的时候要对应上
*   val createTime = TableFill("create_time", FieldFill.INSERT)
*   val updateName = TableFill("update_time", FieldFill.UPDATE)
*   val createUserId = TableFill("create_user_id", FieldFill.INSERT)
*   val updateUserId = TableFill("update_user_id", FieldFill.UPDATE)
*
*  (如果主键是雪花主键)：由于雪花主键过长，返回前端需要转成String,可配置@JsonSerialize(using = ToStringSerializer::class)或者配置全局Long转String
*  (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
*
*  Created by JAVA code generator on 2021-12-15.
*  @author JAVA code generator
*  @since 1.0
*/
@TableName("t_sys_function")
@ApiModel(value="Function对象", description="系统模块或者方法")
public class Function implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "function_id", type = IdType.ASSIGN_ID)
  private Long functionId;

  @ApiModelProperty(value = "父id，就是方法与类的关系")
  @TableField("parent_id")
  private Long parentId;

  @ApiModelProperty(value = "api注释")
  @TableField("label")
  private String label;

  @ApiModelProperty(value = "全类名+方法名")
  @TableField("method")
  private String method;

  @ApiModelProperty(value = "方法信息")
  @TableField("uri")
  private String uri;

  @ApiModelProperty(value = "全类名")
  @TableField("clazz")
  private String clazz;

  @ApiModelProperty(value = "层级")
  @TableField("level")
  private int level;

  @ApiModelProperty(value = "模块，用于分类")
  @TableField("module")
  private int module;

  @ApiModelProperty(value = "多租户")
  @TableField("tenant_id")
  private String tenantId;

  @ApiModelProperty(value = "是否启用")
  @TableField("enabled")
  private int enabled;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private int del;


  public Long getFunctionId() {
    return functionId;
  }

  public void setFunctionId(Long functionId) {
    this.functionId = functionId;
  }
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }
  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }
  public Integer getModule() {
    return module;
  }

  public void setModule(Integer module) {
    this.module = module;
  }
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public Integer getEnabled() {
    return enabled;
  }

  public void setEnabled(Integer enabled) {
    this.enabled = enabled;
  }
  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "Function{" +
        "functionId=" + functionId +
        ", parentId=" + parentId +
        ", label=" + label +
        ", method=" + method +
        ", uri=" + uri +
        ", clazz=" + clazz +
        ", level=" + level +
        ", module=" + module +
        ", tenantId=" + tenantId +
        ", enabled=" + enabled +
        ", del=" + del +
    "}";
  }
}
