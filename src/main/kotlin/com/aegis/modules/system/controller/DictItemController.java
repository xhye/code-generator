package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.DictItemService;
import com.aegis.modules.system.model.entity.DictItem;
import com.aegis.modules.system.model.dto.DictItemPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 字典项数据表模块前端控制器-默认生成的方法不允许修改
 * table t_sys_dict_item
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "dictItem", tags = {"字典项数据表"})
@RestController
@RequestMapping("dictItem")
class DictItemController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final DictItemService dictItemService;
  public DictItemController(DictItemService dictItemService) {
    this.dictItemService = dictItemService;
  }
  @PostMapping
  @ApiOperation("DictItem-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody DictItem dictItem) {
    return Response.successWithData(dictItemService.saveOrUpdate(dictItem));
  }

  @GetMapping("{id}")
  @ApiOperation("DictItem-根据id查找-系统生成")
  private Response<DictItem> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(dictItemService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("DictItem-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(dictItemService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("DictItem-分页查询单表列表-系统生成")
  private Response<IPage<DictItem>> listEqCustomized(@RequestBody DictItemPageDTO<DictItem> params) {
    return Response.successWithData(dictItemService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}