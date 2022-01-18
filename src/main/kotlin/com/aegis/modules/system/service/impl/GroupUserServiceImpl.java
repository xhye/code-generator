package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.GroupUser;
import com.aegis.modules.system.dao.GroupUserMapper;
import com.aegis.modules.system.service.GroupUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.GroupUserPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 组-角色 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class GroupUserServiceImpl extends ServiceImpl<GroupUserMapper, GroupUser> implements GroupUserService {
  @Override
  public IPage<GroupUser> listByEqCustomized(GroupUserPageDTO<GroupUser> params) {
    QueryWrapper<GroupUser> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
