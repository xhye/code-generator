package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.UserOrganization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.UserOrganizationDTO;
import com.aegis.modules.system.model.dto.UserOrganizationPageDTO;
import com.aegis.modules.system.model.vo.UserOrganizationVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户机构表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface UserOrganizationMapper extends BaseMapper<UserOrganization> {
  /**
  * 查询列表-无分页
  */
  List<UserOrganizationVO> listNoPage(UserOrganizationDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<UserOrganizationVO> listWithPage(UserOrganizationPageDTO<UserOrganizationVO> params);
}
