package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.RoleFunction;
import com.aegis.modules.system.dao.RoleFunctionMapper;
import com.aegis.modules.system.service.RoleFunctionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.RoleFunctionPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 角色权限表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class RoleFunctionServiceImpl extends ServiceImpl<RoleFunctionMapper, RoleFunction> implements RoleFunctionService {
  @Override
  public IPage<RoleFunction> listByEqCustomized(RoleFunctionPageDTO<RoleFunction> params) {
    QueryWrapper<RoleFunction> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
