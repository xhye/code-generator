package com.aegis.modules.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
*  t_sys_organization(组织机构) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_organization")
@ApiModel(value="Organization对象", description="组织机构")
public class Organization implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "organization_id", type = IdType.ASSIGN_ID)
  private Long organizationId;

  @ApiModelProperty(value = "UUID")
  @TableField("uid")
  private String uid;

  @ApiModelProperty(value = "父id")
  @TableField("parent_id")
  private Long parentId;

  @ApiModelProperty(value = "名称")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "编码")
  @TableField("code")
  private String code;

  @ApiModelProperty(value = "成立日期：YYYY-MM-DD")
  @TableField("establish_date")
  private Date establishDate;

  @ApiModelProperty(value = "地址")
  @TableField("address")
  private String address;

  @ApiModelProperty(value = "描述")
  @TableField("description")
  private String description;

  @ApiModelProperty(value = "经度,纬度(116.387596,39.975562)")
  @TableField("lng_and_lat")
  private String lngAndLat;

  @ApiModelProperty(value = "机构类型")
  @TableField("type")
  private int type;

  @ApiModelProperty(value = "手机，多个电话逗号隔开")
  @TableField("mobile")
  private String mobile;

  @ApiModelProperty(value = "区域id")
  @TableField("area_code_id")
  private Long areaCodeId;

  @ApiModelProperty(value = "1-国家/部级单位、2-省/厅，3-市/局、4-区、5-街镇")
  @TableField("grade")
  private int grade;

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


  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
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
  public Date getEstablishDate() {
    return establishDate;
  }

  public void setEstablishDate(Date establishDate) {
    this.establishDate = establishDate;
  }
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public String getLngAndLat() {
    return lngAndLat;
  }

  public void setLngAndLat(String lngAndLat) {
    this.lngAndLat = lngAndLat;
  }
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  public Long getAreaCodeId() {
    return areaCodeId;
  }

  public void setAreaCodeId(Long areaCodeId) {
    this.areaCodeId = areaCodeId;
  }
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
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
    return "Organization{" +
        "organizationId=" + organizationId +
        ", uid=" + uid +
        ", parentId=" + parentId +
        ", name=" + name +
        ", code=" + code +
        ", establishDate=" + establishDate +
        ", address=" + address +
        ", description=" + description +
        ", lngAndLat=" + lngAndLat +
        ", type=" + type +
        ", mobile=" + mobile +
        ", areaCodeId=" + areaCodeId +
        ", grade=" + grade +
        ", tenantId=" + tenantId +
        ", enabled=" + enabled +
        ", del=" + del +
    "}";
  }
}
