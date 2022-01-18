package com.aegis.common.model.dto

import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

/**
 *
 * 分页参数
 * 已继承mybatis-plus分页
 * 使用：所有dto继承此类（或直接继承mybatis-plus BasePage） mapper 接口传入此参数（必须放在第一位） 自动分页
 * 返回类型 IPage<T> com.baomidou.mybatisplus.core.metadata.IPage
 *
 */
@ApiModel(value = "分页对象和查询参数", description = "系统分页基础类")
open class BasePageDTO<T>(
    @ApiModelProperty(value = "关键字查询时必传")
    var keyword: String? = null,
    @ApiModelProperty(value = "用户机构和子机构机构,不包含上级")
    var organizationIds: List<Long> = emptyList(),
    @ApiModelProperty(value = "用户机构和子机构机构，包含上级和下级所有机构")
    var organizationLineIds: List<Long> = emptyList(),
    @ApiModelProperty(value = "前端传过来的机构: 选择结构查询列表必传")
    var organizationId: Long? = null,
    /**
     * 查询参数
     * 固定参数精准查询列表: key,value = ('column,direct', value)
     * column 数据库列名
     * direct 指令 详情请看 https://mp.baomidou.com/guide/wrapper.html
     * value 值
     */
    var query: Map<String, Any> = emptyMap()
) : Page<T>()