package ${package.Entity}.dto;

<#if swagger2>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
import com.aegis.common.model.dto.BaseDTO;
// import ${package.Entity}.entity.${entity};
import javax.validation.constraints.NotNull;

/**
* ${table.comment!} DTO 用于请求参数封装（不用于新增和修改）
*
* (@ApiModelProperty) 注解必须注明 required = true/false, 且在notes说明适用接口
* Created by ${author} on ${date}.
* @author ${author}
* @since 1.0
*/

<#if swagger2>
@ApiModel(value="${entity}DTO", description="${table.comment!}")
</#if>
<#if kotlin>
class ${entity}DTO : BaseDTO(){
  // @field:NotNull
  @ApiModelProperty(value = "示例")
  var example: String? = null
}
<#else>
public class ${entity}DTO extends BaseDTO{
  // @field:NotNull
  @ApiModelProperty(value = "示例")
  private String example;
}
</#if>