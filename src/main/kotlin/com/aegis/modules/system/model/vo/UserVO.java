package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.User;

/**
* 用户表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserVO", description="用户表")
public class UserVO extends User{
  @ApiModelProperty(value = "示例")
  private String example;
}