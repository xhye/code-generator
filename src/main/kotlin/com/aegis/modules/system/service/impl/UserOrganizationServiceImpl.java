package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.UserOrganization;
import com.aegis.modules.system.dao.UserOrganizationMapper;
import com.aegis.modules.system.service.UserOrganizationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.UserOrganizationPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 用户机构表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class UserOrganizationServiceImpl extends ServiceImpl<UserOrganizationMapper, UserOrganization> implements UserOrganizationService {
  @Override
  public IPage<UserOrganization> listByEqCustomized(UserOrganizationPageDTO<UserOrganization> params) {
    QueryWrapper<UserOrganization> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
