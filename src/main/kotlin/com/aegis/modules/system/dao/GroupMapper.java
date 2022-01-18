package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Group;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.GroupDTO;
import com.aegis.modules.system.model.dto.GroupPageDTO;
import com.aegis.modules.system.model.vo.GroupVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 组 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface GroupMapper extends BaseMapper<Group> {
  /**
  * 查询列表-无分页
  */
  List<GroupVO> listNoPage(GroupDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<GroupVO> listWithPage(GroupPageDTO<GroupVO> params);
}
