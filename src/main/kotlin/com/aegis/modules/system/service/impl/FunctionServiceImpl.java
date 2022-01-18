package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.Function;
import com.aegis.modules.system.dao.FunctionMapper;
import com.aegis.modules.system.service.FunctionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.FunctionPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 系统模块或者方法 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class FunctionServiceImpl extends ServiceImpl<FunctionMapper, Function> implements FunctionService {
  @Override
  public IPage<Function> listByEqCustomized(FunctionPageDTO<Function> params) {
    QueryWrapper<Function> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
