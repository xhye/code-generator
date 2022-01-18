package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.ScheduleJobLog;

/**
* 定时任务日志 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="ScheduleJobLogVO", description="定时任务日志")
public class ScheduleJobLogVO extends ScheduleJobLog{
  @ApiModelProperty(value = "示例")
  private String example;
}