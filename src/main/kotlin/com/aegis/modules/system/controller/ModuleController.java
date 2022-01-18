package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.ModuleService;
import com.aegis.modules.system.model.entity.Module;
import com.aegis.modules.system.model.dto.ModulePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 项目/模块明细模块前端控制器-默认生成的方法不允许修改
 * table t_sys_module
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "module", tags = {"项目/模块明细"})
@RestController
@RequestMapping("module")
class ModuleController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final ModuleService moduleService;
  public ModuleController(ModuleService moduleService) {
    this.moduleService = moduleService;
  }
  @PostMapping
  @ApiOperation("Module-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Module module) {
    return Response.successWithData(moduleService.saveOrUpdate(module));
  }

  @GetMapping("{id}")
  @ApiOperation("Module-根据id查找-系统生成")
  private Response<Module> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(moduleService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Module-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(moduleService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Module-分页查询单表列表-系统生成")
  private Response<IPage<Module>> listEqCustomized(@RequestBody ModulePageDTO<Module> params) {
    return Response.successWithData(moduleService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}