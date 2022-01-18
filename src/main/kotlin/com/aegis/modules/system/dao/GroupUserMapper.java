package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.GroupUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.GroupUserDTO;
import com.aegis.modules.system.model.dto.GroupUserPageDTO;
import com.aegis.modules.system.model.vo.GroupUserVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组-角色 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface GroupUserMapper extends BaseMapper<GroupUser> {
  /**
  * 查询列表-无分页
  */
  List<GroupUserVO> listNoPage(GroupUserDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<GroupUserVO> listWithPage(GroupUserPageDTO<GroupUserVO> params);
}
