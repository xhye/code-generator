<#if kotlin>
package ${package.Controller}

import com.baomidou.mybatisplus.core.metadata.IPage
import com.aegis.common.model.entity.Response
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import ${package.Service}.${table.serviceName}
import ${package.Entity}.${entity}
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO
import org.springframework.web.bind.annotation.*
import com.baomidou.mybatisplus.core.metadata.IPage
<#else>
package ${package.Controller};

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;
</#if>

/**
 * ${table.comment}模块前端控制器-默认生成的方法不允许修改
 * table ${table.name}
 *
 * Created by ${author} on ${date}.
 * @author ${author}
 * @since 1.0
 */

<#if kotlin>
@Api("${table.entityPath}", tags = ["${table.comment}"])
<#else>
@Api(value = "${table.entityPath}", tags = {"${table.comment}"})
</#if>
@RestController
@RequestMapping("${table.entityPath}")
<#if kotlin>
class ${table.controllerName}(private val ${entity?uncap_first}Service: ${entity}Service) {
<#else>
class ${table.controllerName} {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final ${entity}Service ${entity?uncap_first}Service;
  public ${table.controllerName}(${entity}Service ${entity?uncap_first}Service) {
    this.${entity?uncap_first}Service = ${entity?uncap_first}Service;
  }
</#if>
  @PostMapping
  @ApiOperation("${entity}-根据有无主键新增或者修改-系统生成")
<#if kotlin>
  fun saveOrUpdate(@RequestBody ${entity?uncap_first}: ${entity}): Response<Boolean> {
    return Response.successWithData(${entity?uncap_first}Service.saveOrUpdate(${entity?uncap_first}))
  }
<#else>
  private Response<Boolean> saveOrUpdate(@RequestBody ${entity} ${entity?uncap_first}) {
    return Response.successWithData(${entity?uncap_first}Service.saveOrUpdate(${entity?uncap_first}));
  }
</#if>

  @GetMapping("{id}")
  @ApiOperation("${entity}-根据id查找-系统生成")
<#if kotlin>
  fun getOne(@PathVariable("id") id: Long): Response<${entity}> {
    return Response.successWithData(${entity?uncap_first}Service.getById(id))
  }
<#else>
  private Response<${entity}> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(${entity?uncap_first}Service.getById(id));
  }
</#if>

  @DeleteMapping
  @ApiOperation("${entity}-根据[ids]数组逻辑删除-系统生成")
<#if kotlin>
  fun delete(@RequestParam("ids") ids: List<Long>): Response<Boolean> {
    return Response.successWithData(${entity?uncap_first}Service.removeByIds(ids))
  }
<#else>
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(${entity?uncap_first}Service.removeByIds(ids));
  }
</#if>

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("${entity}-分页查询单表列表-系统生成")
<#if kotlin>
  fun listEqCustomized(@RequestBody params: ${entity}PageDTO<${entity}>): Response<IPage<${entity}>> {
    return Response.successWithData(${entity?uncap_first}Service.listByEqCustomized(params))
  }
<#else>
  private Response<IPage<${entity}>> listEqCustomized(@RequestBody ${entity}PageDTO<${entity}> params) {
    return Response.successWithData(${entity?uncap_first}Service.listByEqCustomized(params));
  }
</#if>
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}