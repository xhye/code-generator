package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.GroupUserService;
import com.aegis.modules.system.model.entity.GroupUser;
import com.aegis.modules.system.model.dto.GroupUserPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组-角色模块前端控制器-默认生成的方法不允许修改
 * table t_sys_group_user
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "groupUser", tags = {"组-角色"})
@RestController
@RequestMapping("groupUser")
class GroupUserController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final GroupUserService groupUserService;
  public GroupUserController(GroupUserService groupUserService) {
    this.groupUserService = groupUserService;
  }
  @PostMapping
  @ApiOperation("GroupUser-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody GroupUser groupUser) {
    return Response.successWithData(groupUserService.saveOrUpdate(groupUser));
  }

  @GetMapping("{id}")
  @ApiOperation("GroupUser-根据id查找-系统生成")
  private Response<GroupUser> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(groupUserService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("GroupUser-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(groupUserService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("GroupUser-分页查询单表列表-系统生成")
  private Response<IPage<GroupUser>> listEqCustomized(@RequestBody GroupUserPageDTO<GroupUser> params) {
    return Response.successWithData(groupUserService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}