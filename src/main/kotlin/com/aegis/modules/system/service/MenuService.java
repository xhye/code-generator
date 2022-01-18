package com.aegis.modules.system.service;

import com.aegis.modules.system.model.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aegis.modules.system.model.dto.MenuPageDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 前端展示菜单 业务接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface MenuService extends IService<Menu> {

  /**
  * 固定参数精准查询分页、不分页列表
  * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
  * 如果不需要分页 current 传 -1
  * @param params 参数
  */
  IPage<Menu> listByEqCustomized(MenuPageDTO<Menu> params);
}
