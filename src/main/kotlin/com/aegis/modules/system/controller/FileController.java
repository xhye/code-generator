package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.FileService;
import com.aegis.modules.system.model.entity.File;
import com.aegis.modules.system.model.dto.FilePageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 模块前端控制器-默认生成的方法不允许修改
 * table t_sys_file
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "file", tags = {""})
@RestController
@RequestMapping("file")
class FileController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final FileService fileService;
  public FileController(FileService fileService) {
    this.fileService = fileService;
  }
  @PostMapping
  @ApiOperation("File-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody File file) {
    return Response.successWithData(fileService.saveOrUpdate(file));
  }

  @GetMapping("{id}")
  @ApiOperation("File-根据id查找-系统生成")
  private Response<File> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(fileService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("File-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(fileService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("File-分页查询单表列表-系统生成")
  private Response<IPage<File>> listEqCustomized(@RequestBody FilePageDTO<File> params) {
    return Response.successWithData(fileService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}