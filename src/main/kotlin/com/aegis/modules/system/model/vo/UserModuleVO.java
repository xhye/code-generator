package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.UserModule;

/**
* 用户项目/模块表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserModuleVO", description="用户项目/模块表")
public class UserModuleVO extends UserModule{
  @ApiModelProperty(value = "示例")
  private String example;
}