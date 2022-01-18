package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.UserModule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.UserModuleDTO;
import com.aegis.modules.system.model.dto.UserModulePageDTO;
import com.aegis.modules.system.model.vo.UserModuleVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户项目/模块表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface UserModuleMapper extends BaseMapper<UserModule> {
  /**
  * 查询列表-无分页
  */
  List<UserModuleVO> listNoPage(UserModuleDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<UserModuleVO> listWithPage(UserModulePageDTO<UserModuleVO> params);
}
