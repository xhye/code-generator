package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Organization;

/**
* 组织机构 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="OrganizationVO", description="组织机构")
public class OrganizationVO extends Organization{
  @ApiModelProperty(value = "示例")
  private String example;
}