package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.Dict;

/**
* 字典类型表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="DictVO", description="字典类型表")
public class DictVO extends Dict{
  @ApiModelProperty(value = "示例")
  private String example;
}