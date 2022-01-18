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
*  t_sys_role_menu(角色菜单表) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_role_menu")
@ApiModel(value="RoleMenu对象", description="角色菜单表")
public class RoleMenu implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "role_menu_id", type = IdType.ASSIGN_ID)
  private Long roleMenuId;

  @ApiModelProperty(value = "角色主键")
  @TableField("role_id")
  private Long roleId;

  @ApiModelProperty(value = "菜单主键")
  @TableField("menu_id")
  private Long menuId;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private int del;


  public Long getRoleMenuId() {
    return roleMenuId;
  }

  public void setRoleMenuId(Long roleMenuId) {
    this.roleMenuId = roleMenuId;
  }
  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
  public Long getMenuId() {
    return menuId;
  }

  public void setMenuId(Long menuId) {
    this.menuId = menuId;
  }
  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "RoleMenu{" +
        "roleMenuId=" + roleMenuId +
        ", roleId=" + roleId +
        ", menuId=" + menuId +
        ", del=" + del +
    "}";
  }
}
