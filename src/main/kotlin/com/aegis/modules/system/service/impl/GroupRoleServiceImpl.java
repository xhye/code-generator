package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.GroupRole;
import com.aegis.modules.system.dao.GroupRoleMapper;
import com.aegis.modules.system.service.GroupRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.GroupRolePageDTO;
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
public class GroupRoleServiceImpl extends ServiceImpl<GroupRoleMapper, GroupRole> implements GroupRoleService {
  @Override
  public IPage<GroupRole> listByEqCustomized(GroupRolePageDTO<GroupRole> params) {
    QueryWrapper<GroupRole> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
