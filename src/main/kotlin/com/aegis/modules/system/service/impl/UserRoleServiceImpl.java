package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.UserRole;
import com.aegis.modules.system.dao.UserRoleMapper;
import com.aegis.modules.system.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.UserRolePageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 用户角色表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
  @Override
  public IPage<UserRole> listByEqCustomized(UserRolePageDTO<UserRole> params) {
    QueryWrapper<UserRole> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
