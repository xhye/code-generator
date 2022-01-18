package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.UserOrganization;

/**
* 用户机构表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserOrganizationVO", description="用户机构表")
public class UserOrganizationVO extends UserOrganization{
  @ApiModelProperty(value = "示例")
  private String example;
}