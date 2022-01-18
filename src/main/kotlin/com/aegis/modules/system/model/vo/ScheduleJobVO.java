package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.ScheduleJob;

/**
* 定时任务 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="ScheduleJobVO", description="定时任务")
public class ScheduleJobVO extends ScheduleJob{
  @ApiModelProperty(value = "示例")
  private String example;
}