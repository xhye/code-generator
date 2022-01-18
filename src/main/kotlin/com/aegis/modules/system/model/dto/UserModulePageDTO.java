package com.aegis.modules.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.aegis.common.model.dto.BasePageDTO;
// import com.aegis.modules.system.model.entity.UserModule;
import javax.validation.constraints.NotNull;

/**
* 用户项目/模块表 分页DTO
*
* 分页 DTO 用于请求参数封装（不用于新增和修改）
* @ApiModelProperty 注解必须注明 required = true/false, 且在notes说明适用接口
* Created by JAVA code generator on 2021-12-15.
* @author JAVA code generator
* @since 1.0
*/

@ApiModel(value="UserModulePageDTO", description="用户项目/模块表")
public class UserModulePageDTO<T> extends BasePageDTO<T>{
  // @field:NotNull
  @ApiModelProperty(value = "示例")
  private String example;
}
