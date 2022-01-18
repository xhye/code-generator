package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.RoleDTO;
import com.aegis.modules.system.model.dto.RolePageDTO;
import com.aegis.modules.system.model.vo.RoleVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 角色表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface RoleMapper extends BaseMapper<Role> {
  /**
  * 查询列表-无分页
  */
  List<RoleVO> listNoPage(RoleDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<RoleVO> listWithPage(RolePageDTO<RoleVO> params);
}
