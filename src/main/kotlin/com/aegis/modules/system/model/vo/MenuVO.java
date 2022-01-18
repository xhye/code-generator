package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Menu;

/**
* 前端展示菜单 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="MenuVO", description="前端展示菜单")
public class MenuVO extends Menu{
  @ApiModelProperty(value = "示例")
  private String example;
}