package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.UserService;
import com.aegis.modules.system.model.entity.User;
import com.aegis.modules.system.model.dto.UserPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_user
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "user", tags = {"用户表"})
@RestController
@RequestMapping("user")
class UserController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final UserService userService;
  public UserController(UserService userService) {
    this.userService = userService;
  }
  @PostMapping
  @ApiOperation("User-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody User user) {
    return Response.successWithData(userService.saveOrUpdate(user));
  }

  @GetMapping("{id}")
  @ApiOperation("User-根据id查找-系统生成")
  private Response<User> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(userService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("User-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(userService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("User-分页查询单表列表-系统生成")
  private Response<IPage<User>> listEqCustomized(@RequestBody UserPageDTO<User> params) {
    return Response.successWithData(userService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}