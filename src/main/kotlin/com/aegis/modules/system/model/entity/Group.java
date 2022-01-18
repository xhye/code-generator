package com.aegis.modules.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
*  t_sys_group(组) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_group")
@ApiModel(value="Group对象", description="组")
public class Group implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "group_id", type = IdType.ASSIGN_ID)
  private Long groupId;

  @ApiModelProperty(value = "中文名")
  @TableField("name_ch")
  private String nameCh;

  @ApiModelProperty(value = "英文名称")
  @TableField("name_en")
  private String nameEn;

  @ApiModelProperty(value = "父id, 0为顶级")
  @TableField("parent_id")
  private Long parentId;

  @ApiModelProperty(value = "创建时间")
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private Date createTime;

  @ApiModelProperty(value = "创建人主键")
  @TableField(value = "create_user_id", fill = FieldFill.INSERT)
  private Long createUserId;

  @ApiModelProperty(value = "修改时间")
  @TableField(value = "update_time", fill = FieldFill.UPDATE)
  private Date updateTime;

  @ApiModelProperty(value = "修改人主键")
  @TableField(value = "update_user_id", fill = FieldFill.UPDATE)
  private Long updateUserId;

  @ApiModelProperty(value = "多租户")
  @TableField("tenant_id")
  private String tenantId;

  @ApiModelProperty(value = "备注")
  @TableField("remarks")
  private String remarks;

  @ApiModelProperty(value = "是否启用")
  @TableField("enabled")
  private int enabled;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private int del;


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
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
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  public Long getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Long createUserId) {
    this.createUserId = createUserId;
  }
  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
  public Long getUpdateUserId() {
    return updateUserId;
  }

  public void setUpdateUserId(Long updateUserId) {
    this.updateUserId = updateUserId;
  }
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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
    return "Group{" +
        "groupId=" + groupId +
        ", nameCh=" + nameCh +
        ", nameEn=" + nameEn +
        ", parentId=" + parentId +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", updateTime=" + updateTime +
        ", updateUserId=" + updateUserId +
        ", tenantId=" + tenantId +
        ", remarks=" + remarks +
        ", enabled=" + enabled +
        ", del=" + del +
    "}";
  }
}
