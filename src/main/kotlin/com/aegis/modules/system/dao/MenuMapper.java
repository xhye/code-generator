package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.MenuDTO;
import com.aegis.modules.system.model.dto.MenuPageDTO;
import com.aegis.modules.system.model.vo.MenuVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 前端展示菜单 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface MenuMapper extends BaseMapper<Menu> {
  /**
  * 查询列表-无分页
  */
  List<MenuVO> listNoPage(MenuDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<MenuVO> listWithPage(MenuPageDTO<MenuVO> params);
}
