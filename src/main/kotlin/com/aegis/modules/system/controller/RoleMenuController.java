package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.RoleMenuService;
import com.aegis.modules.system.model.entity.RoleMenu;
import com.aegis.modules.system.model.dto.RoleMenuPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 角色菜单表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_role_menu
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "roleMenu", tags = {"角色菜单表"})
@RestController
@RequestMapping("roleMenu")
class RoleMenuController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final RoleMenuService roleMenuService;
  public RoleMenuController(RoleMenuService roleMenuService) {
    this.roleMenuService = roleMenuService;
  }
  @PostMapping
  @ApiOperation("RoleMenu-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody RoleMenu roleMenu) {
    return Response.successWithData(roleMenuService.saveOrUpdate(roleMenu));
  }

  @GetMapping("{id}")
  @ApiOperation("RoleMenu-根据id查找-系统生成")
  private Response<RoleMenu> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(roleMenuService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("RoleMenu-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(roleMenuService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("RoleMenu-分页查询单表列表-系统生成")
  private Response<IPage<RoleMenu>> listEqCustomized(@RequestBody RoleMenuPageDTO<RoleMenu> params) {
    return Response.successWithData(roleMenuService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}