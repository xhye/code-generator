package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.FunctionService;
import com.aegis.modules.system.model.entity.Function;
import com.aegis.modules.system.model.dto.FunctionPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 系统模块或者方法模块前端控制器-默认生成的方法不允许修改
 * table t_sys_function
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "function", tags = {"系统模块或者方法"})
@RestController
@RequestMapping("function")
class FunctionController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final FunctionService functionService;
  public FunctionController(FunctionService functionService) {
    this.functionService = functionService;
  }
  @PostMapping
  @ApiOperation("Function-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Function function) {
    return Response.successWithData(functionService.saveOrUpdate(function));
  }

  @GetMapping("{id}")
  @ApiOperation("Function-根据id查找-系统生成")
  private Response<Function> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(functionService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Function-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(functionService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Function-分页查询单表列表-系统生成")
  private Response<IPage<Function>> listEqCustomized(@RequestBody FunctionPageDTO<Function> params) {
    return Response.successWithData(functionService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}