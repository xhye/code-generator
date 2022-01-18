package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Grant;

/**
* 授权表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="GrantVO", description="授权表")
public class GrantVO extends Grant{
  @ApiModelProperty(value = "示例")
  private String example;
}