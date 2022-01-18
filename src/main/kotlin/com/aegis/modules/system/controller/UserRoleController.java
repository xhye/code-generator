package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.UserRoleService;
import com.aegis.modules.system.model.entity.UserRole;
import com.aegis.modules.system.model.dto.UserRolePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户角色表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_user_role
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "userRole", tags = {"用户角色表"})
@RestController
@RequestMapping("userRole")
class UserRoleController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final UserRoleService userRoleService;
  public UserRoleController(UserRoleService userRoleService) {
    this.userRoleService = userRoleService;
  }
  @PostMapping
  @ApiOperation("UserRole-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody UserRole userRole) {
    return Response.successWithData(userRoleService.saveOrUpdate(userRole));
  }

  @GetMapping("{id}")
  @ApiOperation("UserRole-根据id查找-系统生成")
  private Response<UserRole> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(userRoleService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("UserRole-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(userRoleService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("UserRole-分页查询单表列表-系统生成")
  private Response<IPage<UserRole>> listEqCustomized(@RequestBody UserRolePageDTO<UserRole> params) {
    return Response.successWithData(userRoleService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}