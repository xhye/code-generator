package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.Module;
import com.aegis.modules.system.dao.ModuleMapper;
import com.aegis.modules.system.service.ModuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.ModulePageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 项目/模块明细 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class ModuleServiceImpl extends ServiceImpl<ModuleMapper, Module> implements ModuleService {
  @Override
  public IPage<Module> listByEqCustomized(ModulePageDTO<Module> params) {
    QueryWrapper<Module> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
