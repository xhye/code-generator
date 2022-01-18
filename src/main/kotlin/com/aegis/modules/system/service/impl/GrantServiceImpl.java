package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.Grant;
import com.aegis.modules.system.dao.GrantMapper;
import com.aegis.modules.system.service.GrantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.GrantPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 授权表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class GrantServiceImpl extends ServiceImpl<GrantMapper, Grant> implements GrantService {
  @Override
  public IPage<Grant> listByEqCustomized(GrantPageDTO<Grant> params) {
    QueryWrapper<Grant> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
