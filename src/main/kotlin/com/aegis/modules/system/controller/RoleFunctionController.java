package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.RoleFunctionService;
import com.aegis.modules.system.model.entity.RoleFunction;
import com.aegis.modules.system.model.dto.RoleFunctionPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 角色权限表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_role_function
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "roleFunction", tags = {"角色权限表"})
@RestController
@RequestMapping("roleFunction")
class RoleFunctionController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final RoleFunctionService roleFunctionService;
  public RoleFunctionController(RoleFunctionService roleFunctionService) {
    this.roleFunctionService = roleFunctionService;
  }
  @PostMapping
  @ApiOperation("RoleFunction-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody RoleFunction roleFunction) {
    return Response.successWithData(roleFunctionService.saveOrUpdate(roleFunction));
  }

  @GetMapping("{id}")
  @ApiOperation("RoleFunction-根据id查找-系统生成")
  private Response<RoleFunction> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(roleFunctionService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("RoleFunction-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(roleFunctionService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("RoleFunction-分页查询单表列表-系统生成")
  private Response<IPage<RoleFunction>> listEqCustomized(@RequestBody RoleFunctionPageDTO<RoleFunction> params) {
    return Response.successWithData(roleFunctionService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}