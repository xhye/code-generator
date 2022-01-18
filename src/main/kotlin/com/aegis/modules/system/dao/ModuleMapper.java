package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Module;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.ModuleDTO;
import com.aegis.modules.system.model.dto.ModulePageDTO;
import com.aegis.modules.system.model.vo.ModuleVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 项目/模块明细 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface ModuleMapper extends BaseMapper<Module> {
  /**
  * 查询列表-无分页
  */
  List<ModuleVO> listNoPage(ModuleDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<ModuleVO> listWithPage(ModulePageDTO<ModuleVO> params);
}
