package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.GroupService;
import com.aegis.modules.system.model.entity.Group;
import com.aegis.modules.system.model.dto.GroupPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组模块前端控制器-默认生成的方法不允许修改
 * table t_sys_group
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "group", tags = {"组"})
@RestController
@RequestMapping("group")
class GroupController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final GroupService groupService;
  public GroupController(GroupService groupService) {
    this.groupService = groupService;
  }
  @PostMapping
  @ApiOperation("Group-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Group group) {
    return Response.successWithData(groupService.saveOrUpdate(group));
  }

  @GetMapping("{id}")
  @ApiOperation("Group-根据id查找-系统生成")
  private Response<Group> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(groupService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Group-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(groupService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Group-分页查询单表列表-系统生成")
  private Response<IPage<Group>> listEqCustomized(@RequestBody GroupPageDTO<Group> params) {
    return Response.successWithData(groupService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}