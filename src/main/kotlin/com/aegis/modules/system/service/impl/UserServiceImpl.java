package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.User;
import com.aegis.modules.system.dao.UserMapper;
import com.aegis.modules.system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.UserPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 用户表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
  @Override
  public IPage<User> listByEqCustomized(UserPageDTO<User> params) {
    QueryWrapper<User> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
