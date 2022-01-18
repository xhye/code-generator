package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.RoleService;
import com.aegis.modules.system.model.entity.Role;
import com.aegis.modules.system.model.dto.RolePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 角色表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_role
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "role", tags = {"角色表"})
@RestController
@RequestMapping("role")
class RoleController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final RoleService roleService;
  public RoleController(RoleService roleService) {
    this.roleService = roleService;
  }
  @PostMapping
  @ApiOperation("Role-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Role role) {
    return Response.successWithData(roleService.saveOrUpdate(role));
  }

  @GetMapping("{id}")
  @ApiOperation("Role-根据id查找-系统生成")
  private Response<Role> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(roleService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Role-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(roleService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Role-分页查询单表列表-系统生成")
  private Response<IPage<Role>> listEqCustomized(@RequestBody RolePageDTO<Role> params) {
    return Response.successWithData(roleService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}