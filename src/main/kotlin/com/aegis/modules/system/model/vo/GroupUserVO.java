package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.GroupUser;

/**
* 组-角色 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="GroupUserVO", description="组-角色")
public class GroupUserVO extends GroupUser{
  @ApiModelProperty(value = "示例")
  private String example;
}