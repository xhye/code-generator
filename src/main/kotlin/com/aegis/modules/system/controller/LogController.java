package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.LogService;
import com.aegis.modules.system.model.entity.Log;
import com.aegis.modules.system.model.dto.LogPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 模块前端控制器-默认生成的方法不允许修改
 * table t_sys_log
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "log", tags = {""})
@RestController
@RequestMapping("log")
class LogController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final LogService logService;
  public LogController(LogService logService) {
    this.logService = logService;
  }
  @PostMapping
  @ApiOperation("Log-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Log log) {
    return Response.successWithData(logService.saveOrUpdate(log));
  }

  @GetMapping("{id}")
  @ApiOperation("Log-根据id查找-系统生成")
  private Response<Log> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(logService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Log-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(logService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Log-分页查询单表列表-系统生成")
  private Response<IPage<Log>> listEqCustomized(@RequestBody LogPageDTO<Log> params) {
    return Response.successWithData(logService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}