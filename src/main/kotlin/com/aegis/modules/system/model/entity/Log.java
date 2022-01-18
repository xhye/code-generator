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
*  t_sys_log() 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_log")
@ApiModel(value="Log对象", description="")
public class Log implements Serializable{

  @ApiModelProperty(value = "雪花主键")
  @TableId(value = "log_id", type = IdType.ASSIGN_ID)
  private Long logId;

  @ApiModelProperty(value = "操作人主键")
  @TableField("user_id")
  private Long userId;

  @ApiModelProperty(value = "ip地址")
  @TableField("ip")
  private String ip;

  @ApiModelProperty(value = "耗时：毫秒")
  @TableField("cost")
  private Long cost;

  @ApiModelProperty(value = "请求状态0-失败1-成功 默认1")
  @TableField("status")
  private int status;

  @ApiModelProperty(value = "说明")
  @TableField("label")
  private String label;

  @ApiModelProperty(value = "全类名")
  @TableField("clazz")
  private String clazz;

  @ApiModelProperty(value = "方法名（重载的可加上参数）")
  @TableField("method")
  private String method;

  @ApiModelProperty(value = "json参数")
  @TableField("params")
  private String params;

  @ApiModelProperty(value = "json结果")
  @TableField("result")
  private String result;

  @ApiModelProperty(value = "多租户")
  @TableField("tenant_id")
  private String tenantId;

  @ApiModelProperty(value = "操作时间")
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private Date createTime;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private Boolean del;


  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
  }
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  public Boolean getDel() {
    return del;
  }

  public void setDel(Boolean del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "Log{" +
        "logId=" + logId +
        ", userId=" + userId +
        ", ip=" + ip +
        ", cost=" + cost +
        ", status=" + status +
        ", label=" + label +
        ", clazz=" + clazz +
        ", method=" + method +
        ", params=" + params +
        ", result=" + result +
        ", tenantId=" + tenantId +
        ", createTime=" + createTime +
        ", del=" + del +
    "}";
  }
}
