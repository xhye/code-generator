package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.GroupRoleService;
import com.aegis.modules.system.model.entity.GroupRole;
import com.aegis.modules.system.model.dto.GroupRolePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组-角色模块前端控制器-默认生成的方法不允许修改
 * table t_sys_group_role
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "groupRole", tags = {"组-角色"})
@RestController
@RequestMapping("groupRole")
class GroupRoleController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final GroupRoleService groupRoleService;
  public GroupRoleController(GroupRoleService groupRoleService) {
    this.groupRoleService = groupRoleService;
  }
  @PostMapping
  @ApiOperation("GroupRole-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody GroupRole groupRole) {
    return Response.successWithData(groupRoleService.saveOrUpdate(groupRole));
  }

  @GetMapping("{id}")
  @ApiOperation("GroupRole-根据id查找-系统生成")
  private Response<GroupRole> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(groupRoleService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("GroupRole-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(groupRoleService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("GroupRole-分页查询单表列表-系统生成")
  private Response<IPage<GroupRole>> listEqCustomized(@RequestBody GroupRolePageDTO<GroupRole> params) {
    return Response.successWithData(groupRoleService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}