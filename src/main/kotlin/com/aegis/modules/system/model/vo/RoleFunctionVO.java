package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.RoleFunction;

/**
* 角色权限表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="RoleFunctionVO", description="角色权限表")
public class RoleFunctionVO extends RoleFunction{
  @ApiModelProperty(value = "示例")
  private String example;
}