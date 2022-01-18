package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.RoleFunction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.RoleFunctionDTO;
import com.aegis.modules.system.model.dto.RoleFunctionPageDTO;
import com.aegis.modules.system.model.vo.RoleFunctionVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 角色权限表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface RoleFunctionMapper extends BaseMapper<RoleFunction> {
  /**
  * 查询列表-无分页
  */
  List<RoleFunctionVO> listNoPage(RoleFunctionDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<RoleFunctionVO> listWithPage(RoleFunctionPageDTO<RoleFunctionVO> params);
}
