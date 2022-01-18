package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Role;

/**
* 角色表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="RoleVO", description="角色表")
public class RoleVO extends Role{
  @ApiModelProperty(value = "示例")
  private String example;
}