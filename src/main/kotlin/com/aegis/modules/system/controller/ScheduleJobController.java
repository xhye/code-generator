package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.ScheduleJobService;
import com.aegis.modules.system.model.entity.ScheduleJob;
import com.aegis.modules.system.model.dto.ScheduleJobPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 定时任务模块前端控制器-默认生成的方法不允许修改
 * table t_sys_schedule_job
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "scheduleJob", tags = {"定时任务"})
@RestController
@RequestMapping("scheduleJob")
class ScheduleJobController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final ScheduleJobService scheduleJobService;
  public ScheduleJobController(ScheduleJobService scheduleJobService) {
    this.scheduleJobService = scheduleJobService;
  }
  @PostMapping
  @ApiOperation("ScheduleJob-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody ScheduleJob scheduleJob) {
    return Response.successWithData(scheduleJobService.saveOrUpdate(scheduleJob));
  }

  @GetMapping("{id}")
  @ApiOperation("ScheduleJob-根据id查找-系统生成")
  private Response<ScheduleJob> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(scheduleJobService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("ScheduleJob-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(scheduleJobService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("ScheduleJob-分页查询单表列表-系统生成")
  private Response<IPage<ScheduleJob>> listEqCustomized(@RequestBody ScheduleJobPageDTO<ScheduleJob> params) {
    return Response.successWithData(scheduleJobService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}