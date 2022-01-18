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
*  t_sys_user(用户表) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_user")
@ApiModel(value="User对象", description="用户表")
public class User implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "user_id", type = IdType.ASSIGN_ID)
  private Long userId;

  @ApiModelProperty(value = "多租户")
  @TableField("tenant_id")
  private String tenantId;

  @ApiModelProperty(value = "UUID")
  @TableField("uid")
  private String uid;

  @ApiModelProperty(value = "用户名")
  @TableField("username")
  private String username;

  @ApiModelProperty(value = "密码")
  @TableField("password")
  private String password;

  @ApiModelProperty(value = "盐值")
  @TableField("salt")
  private String salt;

  @ApiModelProperty(value = "真是姓名")
  @TableField("real_name")
  private String realName;

  @ApiModelProperty(value = "性别：0保密或未知，1男，2女")
  @TableField("sex")
  private String sex;

  @ApiModelProperty(value = "手机")
  @TableField("mobile")
  private String mobile;

  @ApiModelProperty(value = "证件号")
  @TableField("certificate")
  private String certificate;

  @ApiModelProperty(value = "证件类型：1.身份证 2.港澳通行证")
  @TableField("certificate_type")
  private String certificateType;

  @ApiModelProperty(value = "邮箱")
  @TableField("email")
  private String email;

  @ApiModelProperty(value = "地址")
  @TableField("address")
  private String address;

  @ApiModelProperty(value = "头像")
  @TableField("avatar")
  private String avatar;

  @ApiModelProperty(value = "微信专用")
  @TableField("open_id")
  private String openId;

  @ApiModelProperty(value = "微信专用")
  @TableField("union_id")
  private String unionId;

  @ApiModelProperty(value = "数据来源：1.注册 2.同步")
  @TableField("source")
  private int source;

  @ApiModelProperty(value = "区域id")
  @TableField("area_code_id")
  private Long areaCodeId;

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

  @ApiModelProperty(value = "是否启用")
  @TableField("enabled")
  private int enabled;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private int del;


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }
  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }
  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }
  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }
  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }
  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }
  public Long getAreaCodeId() {
    return areaCodeId;
  }

  public void setAreaCodeId(Long areaCodeId) {
    this.areaCodeId = areaCodeId;
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
    return "User{" +
        "userId=" + userId +
        ", tenantId=" + tenantId +
        ", uid=" + uid +
        ", username=" + username +
        ", password=" + password +
        ", salt=" + salt +
        ", realName=" + realName +
        ", sex=" + sex +
        ", mobile=" + mobile +
        ", certificate=" + certificate +
        ", certificateType=" + certificateType +
        ", email=" + email +
        ", address=" + address +
        ", avatar=" + avatar +
        ", openId=" + openId +
        ", unionId=" + unionId +
        ", source=" + source +
        ", areaCodeId=" + areaCodeId +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", updateTime=" + updateTime +
        ", updateUserId=" + updateUserId +
        ", enabled=" + enabled +
        ", del=" + del +
    "}";
  }
}
