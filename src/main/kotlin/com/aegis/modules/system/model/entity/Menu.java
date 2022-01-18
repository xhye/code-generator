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
*  t_sys_menu(前端展示菜单) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_menu")
@ApiModel(value="Menu对象", description="前端展示菜单")
public class Menu implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "menu_id", type = IdType.ASSIGN_ID)
  private Long menuId;

  @ApiModelProperty(value = "中文名")
  @TableField("name_ch")
  private String nameCh;

  @ApiModelProperty(value = "英文名称")
  @TableField("name_en")
  private String nameEn;

  @ApiModelProperty(value = "图标")
  @TableField("icon")
  private String icon;

  @ApiModelProperty(value = "路由")
  @TableField("route")
  private String route;

  @ApiModelProperty(value = "排序")
  @TableField("order")
  private int order;

  @ApiModelProperty(value = "父id")
  @TableField("parent_id")
  private Long parentId;

  @ApiModelProperty(value = "类型：1.文件夹 2.菜单")
  @TableField("type")
  private int type;

  @ApiModelProperty(value = "模块，用于分类")
  @TableField("module")
  private String module;

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


  public Long getMenuId() {
    return menuId;
  }

  public void setMenuId(Long menuId) {
    this.menuId = menuId;
  }
  public String getNameCh() {
    return nameCh;
  }

  public void setNameCh(String nameCh) {
    this.nameCh = nameCh;
  }
  public String getNameEn() {
    return nameEn;
  }

  public void setNameEn(String nameEn) {
    this.nameEn = nameEn;
  }
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
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
    return "Menu{" +
        "menuId=" + menuId +
        ", nameCh=" + nameCh +
        ", nameEn=" + nameEn +
        ", icon=" + icon +
        ", route=" + route +
        ", order=" + order +
        ", parentId=" + parentId +
        ", type=" + type +
        ", module=" + module +
        ", tenantId=" + tenantId +
        ", enabled=" + enabled +
        ", del=" + del +
    "}";
  }
}
