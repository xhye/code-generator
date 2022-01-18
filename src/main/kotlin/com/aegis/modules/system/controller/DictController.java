package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.DictService;
import com.aegis.modules.system.model.entity.Dict;
import com.aegis.modules.system.model.dto.DictPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 字典类型表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_dict
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "dict", tags = {"字典类型表"})
@RestController
@RequestMapping("dict")
class DictController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final DictService dictService;
  public DictController(DictService dictService) {
    this.dictService = dictService;
  }
  @PostMapping
  @ApiOperation("Dict-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Dict dict) {
    return Response.successWithData(dictService.saveOrUpdate(dict));
  }

  @GetMapping("{id}")
  @ApiOperation("Dict-根据id查找-系统生成")
  private Response<Dict> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(dictService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Dict-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(dictService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Dict-分页查询单表列表-系统生成")
  private Response<IPage<Dict>> listEqCustomized(@RequestBody DictPageDTO<Dict> params) {
    return Response.successWithData(dictService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}