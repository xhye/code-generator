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
*  t_sys_file() 对应数据表, 表结构改变这里需要同步修改（表结构不变不允许修改）
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
@TableName("t_sys_file")
@ApiModel(value="File对象", description="")
public class File implements Serializable{

  @ApiModelProperty(value = "主键")
  @TableId(value = "file_id", type = IdType.ASSIGN_ID)
  private Long fileId;

  @ApiModelProperty(value = "标题")
  @TableField("title")
  private String title;

  @ApiModelProperty(value = "文件大小(byte)")
  @TableField("total_size")
  private Long totalSize;

  @ApiModelProperty(value = "路径")
  @TableField("url")
  private String url;

  @ApiModelProperty(value = "文件类型（1：视频，2：文本，3：图片，4：其他）")
  @TableField("file_type")
  private int fileType;

  @ApiModelProperty(value = "文件后缀")
  @TableField("file_suffix")
  private String fileSuffix;

  @ApiModelProperty(value = "关联类型：待定，请在常量配置")
  @TableField("ref_type")
  private String refType;

  @ApiModelProperty(value = "关联主键(案件主键caseId)")
  @TableField("ref_id")
  private Long refId;

  @ApiModelProperty(value = "双重关联主键,当一个关联主键不满足时启用")
  @TableField("double_ref_id")
  private Long doubleRefId;

  @ApiModelProperty(value = "是否启用(0.禁用 1.启用)")
  @TableField("enabled")
  private Boolean enabled;

  @ApiModelProperty(value = "创建时间")
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private Date createTime;

  @ApiModelProperty(value = "是否删除")
  @TableField("del")
  @TableLogic
  private Boolean del;


  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  public Long getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Long totalSize) {
    this.totalSize = totalSize;
  }
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
  public String getFileSuffix() {
    return fileSuffix;
  }

  public void setFileSuffix(String fileSuffix) {
    this.fileSuffix = fileSuffix;
  }
  public String getRefType() {
    return refType;
  }

  public void setRefType(String refType) {
    this.refType = refType;
  }
  public Long getRefId() {
    return refId;
  }

  public void setRefId(Long refId) {
    this.refId = refId;
  }
  public Long getDoubleRefId() {
    return doubleRefId;
  }

  public void setDoubleRefId(Long doubleRefId) {
    this.doubleRefId = doubleRefId;
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
  public Boolean getDel() {
    return del;
  }

  public void setDel(Boolean del) {
    this.del = del;
  }
  @Override
  public String toString() {
    return "File{" +
        "fileId=" + fileId +
        ", title=" + title +
        ", totalSize=" + totalSize +
        ", url=" + url +
        ", fileType=" + fileType +
        ", fileSuffix=" + fileSuffix +
        ", refType=" + refType +
        ", refId=" + refId +
        ", doubleRefId=" + doubleRefId +
        ", enabled=" + enabled +
        ", createTime=" + createTime +
        ", del=" + del +
    "}";
  }
}
