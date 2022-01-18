package com.aegis.modules.system.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.DictItem;

/**
* 字典项数据表 VO
*
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="DictItemVO", description="字典项数据表")
public class DictItemVO extends DictItem{
  @ApiModelProperty(value = "示例")
  private String example;
}