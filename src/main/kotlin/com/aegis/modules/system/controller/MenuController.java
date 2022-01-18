package com.aegis.modules.system.controller;

import com.aegis.common.model.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.aegis.modules.system.service.MenuService;
import com.aegis.modules.system.model.entity.Menu;
import com.aegis.modules.system.model.dto.MenuPageDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 前端展示菜单模块前端控制器-默认生成的方法不允许修改
 * table t_sys_menu
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */

@Api(value = "menu", tags = {"前端展示菜单"})
@RestController
@RequestMapping("menu")
class MenuController {


  // ================================== 以下为代码生成器所生成代码，不允许修改 =================================
  private final MenuService menuService;
  public MenuController(MenuService menuService) {
    this.menuService = menuService;
  }
  @PostMapping
  @ApiOperation("Menu-根据有无主键新增或者修改-系统生成")
  private Response<Boolean> saveOrUpdate(@RequestBody Menu menu) {
    return Response.successWithData(menuService.saveOrUpdate(menu));
  }

  @GetMapping("{id}")
  @ApiOperation("Menu-根据id查找-系统生成")
  private Response<Menu> getOne(@PathVariable("id")Long id) {
    return Response.successWithData(menuService.getById(id));
  }

  @DeleteMapping
  @ApiOperation("Menu-根据[ids]数组逻辑删除-系统生成")
  private Response<Boolean> delete(@RequestParam("ids")List<Long> ids) {
    return Response.successWithData(menuService.removeByIds(ids));
  }

  /**
  * 使用说明
  * 参数 query (key,value) = ('column,direct', value)
  * direct: 参考 MybatisPlusUtil
  */
  @PostMapping("list_customized")
  @ApiOperation("Menu-分页查询单表列表-系统生成")
  private Response<IPage<Menu>> listEqCustomized(@RequestBody MenuPageDTO<Menu> params) {
    return Response.successWithData(menuService.listByEqCustomized(params));
  }
  // ================================== 以上为代码生成器所生成代码，不允许修改 =================================


}