package com.aegis.common.model.dto
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
/**
 *
 * 基础查询参数 无分页
 *
 */
@ApiModel(value = "BaseDTO", description = "基础查询参数")
open class BaseDTO(
    @ApiModelProperty(value = "关键字查询时必传", required = true)
    var keyword: String? = null,
    @ApiModelProperty(value = "用户机构和子机构机构,不包含上级, 用于数据层级查询")
    var organizationIds: List<Long> = emptyList(),
    @ApiModelProperty(value = "用户机构和子机构机构，包含上级和下级所有机构，用于数据层级查询")
    var organizationLineIds: List<Long> = emptyList(),
    @ApiModelProperty(value = "前端传过来的机构: 选择结构查询列表必传", required = true)
    var organizationId: Long? = null
)