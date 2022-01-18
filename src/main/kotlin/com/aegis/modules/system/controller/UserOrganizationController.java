package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.UserOrganizationService;
import com.aegis.modules.system.model.entity.UserOrganization;
import com.aegis.modules.system.model.dto.UserOrganizationPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户机构表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_user_organization
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "userOrganization", tags = {"用户机构表"})
@RestController
@RequestMapping("userOrganization")
class UserOrganizationController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final UserOrganizationService userOrganizationService;
  public UserOrganizationController(UserOrganizationService userOrganizationService) {
    this.userOrganizationService = userOrganizationService;
  }
  @PostMapping
  @ApiOperation("UserOrganization-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody UserOrganization userOrganization) {
    return Response.successWithData(userOrganizationService.saveOrUpdate(userOrganization));
  }

  @GetMapping("{id}")
  @ApiOperation("UserOrganization-根据id查找-系统生成")
  private Response<UserOrganization> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(userOrganizationService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("UserOrganization-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(userOrganizationService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("UserOrganization-分页查询单表列表-系统生成")
  private Response<IPage<UserOrganization>> listEqCustomized(@RequestBody UserOrganizationPageDTO<UserOrganization> params) {
    return Response.successWithData(userOrganizationService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}