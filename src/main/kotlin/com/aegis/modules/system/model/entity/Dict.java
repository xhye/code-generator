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
*  t_sys_dict(字典类型表) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_dict")
@ApiModel(value="Dict对象", description="字典类型表")
public class Dict implements Serializable{

  @ApiModelProperty(value = "字典主键")
  @TableId(value = "dict_id", type = IdType.ASSIGN_ID)
  private Long dictId;

  @ApiModelProperty(value = "字典名称")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "字典类型")
  @TableField("code")
  private String code;

  @ApiModelProperty(value = "状态（1正常 0停用）")
  @TableField("enabled")
  private Boolean enabled;

  @ApiModelProperty(value = "创建时间")
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private Date createTime;

  @ApiModelProperty(value = "更新时间")
  @TableField(value = "update_time", fill = FieldFill.UPDATE)
  private Date updateTime;

  @ApiModelProperty(value = "创建人主键")
  @TableField(value = "create_user_id", fill = FieldFill.INSERT)
  private Long createUserId;

  @ApiModelProperty(value = "更新人主键")
  @TableField(value = "update_user_id", fill = FieldFill.UPDATE)
  private Long updateUserId;

  @ApiModelProperty(value = "备注")
  @TableField("remarks")
  private String remarks;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private Boolean del;


  public Long getDictId() {
    return dictId;
  }

  public void setDictId(Long dictId) {
    this.dictId = dictId;
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
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
  public Long getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Long createUserId) {
    this.createUserId = createUserId;
  }
  public Long getUpdateUserId() {
    return updateUserId;
  }

  public void setUpdateUserId(Long updateUserId) {
    this.updateUserId = updateUserId;
  }
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
  public Boolean getDel() {
    return del;
  }

  public void setDel(Boolean del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "Dict{" +
        "dictId=" + dictId +
        ", name=" + name +
        ", code=" + code +
        ", enabled=" + enabled +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", remarks=" + remarks +
        ", del=" + del +
    "}";
  }
}
