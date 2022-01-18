package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.UserRole;

/**
* 用户角色表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserRoleVO", description="用户角色表")
public class UserRoleVO extends UserRole{
  @ApiModelProperty(value = "示例")
  private String example;
}