package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.ScheduleJobLogService;
import com.aegis.modules.system.model.entity.ScheduleJobLog;
import com.aegis.modules.system.model.dto.ScheduleJobLogPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 定时任务日志模块前端控制器-默认生成的方法不允许修改
 * table t_sys_schedule_job_log
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "scheduleJobLog", tags = {"定时任务日志"})
@RestController
@RequestMapping("scheduleJobLog")
class ScheduleJobLogController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final ScheduleJobLogService scheduleJobLogService;
  public ScheduleJobLogController(ScheduleJobLogService scheduleJobLogService) {
    this.scheduleJobLogService = scheduleJobLogService;
  }
  @PostMapping
  @ApiOperation("ScheduleJobLog-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody ScheduleJobLog scheduleJobLog) {
    return Response.successWithData(scheduleJobLogService.saveOrUpdate(scheduleJobLog));
  }

  @GetMapping("{id}")
  @ApiOperation("ScheduleJobLog-根据id查找-系统生成")
  private Response<ScheduleJobLog> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(scheduleJobLogService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("ScheduleJobLog-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(scheduleJobLogService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("ScheduleJobLog-分页查询单表列表-系统生成")
  private Response<IPage<ScheduleJobLog>> listEqCustomized(@RequestBody ScheduleJobLogPageDTO<ScheduleJobLog> params) {
    return Response.successWithData(scheduleJobLogService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}