package com.aegis.modules.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.GroupRole;

/**
* 组-角色 DTO 用于新增和修改传参
*
* (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="GroupRoleAddOrUpdateDTO", description="组-角色")
public class GroupRoleAddOrUpdateDTO extends GroupRole {
  @ApiModelProperty(value = "示例")
  private String example;
}
