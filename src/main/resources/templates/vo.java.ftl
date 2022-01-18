package ${package.Entity}.vo;

<#if swagger2>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
import ${package.Entity}.entity.${entity};

/**
* ${table.comment!} VO
*
* Created by ${author} on ${date}.
* @author ${author}
* @since 1.0
*/

<#if swagger2>
@ApiModel(value="${entity}VO", description="${table.comment!}")
</#if>
public class ${entity}VO extends ${entity}{
  @ApiModelProperty(value = "示例")
  private String example;
}