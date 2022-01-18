package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Module;

/**
* 项目/模块明细 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="ModuleVO", description="项目/模块明细")
public class ModuleVO extends Module{
  @ApiModelProperty(value = "示例")
  private String example;
}