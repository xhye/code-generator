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
*  t_sys_schedule_job(定时任务) 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_schedule_job")
@ApiModel(value="ScheduleJob对象", description="定时任务")
public class ScheduleJob implements Serializable{

  @ApiModelProperty(value = "任务id")
  @TableId(value = "job_id", type = IdType.ASSIGN_ID)
  private Long jobId;

  @ApiModelProperty(value = "spring bean名称")
  @TableField("bean_name")
  private String beanName;

  @ApiModelProperty(value = "参数")
  @TableField("params")
  private String params;

  @ApiModelProperty(value = "cron表达式")
  @TableField("cron_expression")
  private String cronExpression;

  @ApiModelProperty(value = "任务状态  0：暂停  1：正常")
  @TableField("status")
  private int status;

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


  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }
  public String getBeanName() {
    return beanName;
  }

  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
    return "ScheduleJob{" +
        "jobId=" + jobId +
        ", beanName=" + beanName +
        ", params=" + params +
        ", cronExpression=" + cronExpression +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", remarks=" + remarks +
        ", del=" + del +
    "}";
  }
}
