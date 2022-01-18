package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.UserModuleService;
import com.aegis.modules.system.model.entity.UserModule;
import com.aegis.modules.system.model.dto.UserModulePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户项目/模块表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_user_module
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "userModule", tags = {"用户项目/模块表"})
@RestController
@RequestMapping("userModule")
class UserModuleController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final UserModuleService userModuleService;
  public UserModuleController(UserModuleService userModuleService) {
    this.userModuleService = userModuleService;
  }
  @PostMapping
  @ApiOperation("UserModule-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody UserModule userModule) {
    return Response.successWithData(userModuleService.saveOrUpdate(userModule));
  }

  @GetMapping("{id}")
  @ApiOperation("UserModule-根据id查找-系统生成")
  private Response<UserModule> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(userModuleService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("UserModule-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(userModuleService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("UserModule-分页查询单表列表-系统生成")
  private Response<IPage<UserModule>> listEqCustomized(@RequestBody UserModulePageDTO<UserModule> params) {
    return Response.successWithData(userModuleService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}