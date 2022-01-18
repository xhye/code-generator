package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.GroupRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.GroupRoleDTO;
import com.aegis.modules.system.model.dto.GroupRolePageDTO;
import com.aegis.modules.system.model.vo.GroupRoleVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组-角色 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface GroupRoleMapper extends BaseMapper<GroupRole> {
  /**
  * 查询列表-无分页
  */
  List<GroupRoleVO> listNoPage(GroupRoleDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<GroupRoleVO> listWithPage(GroupRolePageDTO<GroupRoleVO> params);
}
