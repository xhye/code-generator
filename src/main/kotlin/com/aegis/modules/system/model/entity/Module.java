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
*  t_sys_module(项目/模块明细) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_module")
@ApiModel(value="Module对象", description="项目/模块明细")
public class Module implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "module_id", type = IdType.ASSIGN_ID)
  private Long moduleId;

  @ApiModelProperty(value = "多租户")
  @TableField("tenant_id")
  private String tenantId;

  @ApiModelProperty(value = "模块名")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "编码")
  @TableField("code")
  private String code;

  @ApiModelProperty(value = "路由/url")
  @TableField("route")
  private String route;

  @ApiModelProperty(value = "跳转是否鉴权")
  @TableField("authority")
  private int authority;

  @ApiModelProperty(value = "排序")
  @TableField("order")
  private int order;

  @ApiModelProperty(value = "是否启用")
  @TableField("enable")
  private int enable;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private int del;


  public Long getModuleId() {
    return moduleId;
  }

  public void setModuleId(Long moduleId) {
    this.moduleId = moduleId;
  }
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }
  public Integer getAuthority() {
    return authority;
  }

  public void setAuthority(Integer authority) {
    this.authority = authority;
  }
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }
  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "Module{" +
        "moduleId=" + moduleId +
        ", tenantId=" + tenantId +
        ", name=" + name +
        ", code=" + code +
        ", route=" + route +
        ", authority=" + authority +
        ", order=" + order +
        ", enable=" + enable +
        ", del=" + del +
    "}";
  }
}
