package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Function;

/**
* 系统模块或者方法 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="FunctionVO", description="系统模块或者方法")
public class FunctionVO extends Function{
  @ApiModelProperty(value = "示例")
  private String example;
}