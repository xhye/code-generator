package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.GrantService;
import com.aegis.modules.system.model.entity.Grant;
import com.aegis.modules.system.model.dto.GrantPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 授权表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_grant
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "grant", tags = {"授权表"})
@RestController
@RequestMapping("grant")
class GrantController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final GrantService grantService;
  public GrantController(GrantService grantService) {
    this.grantService = grantService;
  }
  @PostMapping
  @ApiOperation("Grant-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Grant grant) {
    return Response.successWithData(grantService.saveOrUpdate(grant));
  }

  @GetMapping("{id}")
  @ApiOperation("Grant-根据id查找-系统生成")
  private Response<Grant> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(grantService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Grant-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(grantService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Grant-分页查询单表列表-系统生成")
  private Response<IPage<Grant>> listEqCustomized(@RequestBody GrantPageDTO<Grant> params) {
    return Response.successWithData(grantService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}