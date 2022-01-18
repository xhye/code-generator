package com.aegis.modules.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.modules.system.model.entity.UserModule;

/**
* 用户项目/模块表 DTO 用于新增和修改传参
*
* (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserModuleAddOrUpdateDTO", description="用户项目/模块表")
public class UserModuleAddOrUpdateDTO extends UserModule {
  @ApiModelProperty(value = "示例")
  private String example;
}
