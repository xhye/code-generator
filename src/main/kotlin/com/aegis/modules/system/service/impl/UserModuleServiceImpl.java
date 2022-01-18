package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.UserModule;
import com.aegis.modules.system.dao.UserModuleMapper;
import com.aegis.modules.system.service.UserModuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.UserModulePageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 用户项目/模块表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class UserModuleServiceImpl extends ServiceImpl<UserModuleMapper, UserModule> implements UserModuleService {
  @Override
  public IPage<UserModule> listByEqCustomized(UserModulePageDTO<UserModule> params) {
    QueryWrapper<UserModule> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
