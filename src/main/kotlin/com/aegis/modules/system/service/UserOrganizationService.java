package com.aegis.modules.system.service;

import com.aegis.modules.system.model.entity.UserOrganization;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aegis.modules.system.model.dto.UserOrganizationPageDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户机构表 业务接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface UserOrganizationService extends IService<UserOrganization> {

  /**
  * 固定参数精准查询分页、不分页列表
  * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
  * 如果不需要分页 current 传 -1
  * @param params 参数
  */
  IPage<UserOrganization> listByEqCustomized(UserOrganizationPageDTO<UserOrganization> params);
}
