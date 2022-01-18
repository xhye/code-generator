package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.DictItem;
import com.aegis.modules.system.dao.DictItemMapper;
import com.aegis.modules.system.service.DictItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.DictItemPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 字典项数据表 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class DictItemServiceImpl extends ServiceImpl<DictItemMapper, DictItem> implements DictItemService {
  @Override
  public IPage<DictItem> listByEqCustomized(DictItemPageDTO<DictItem> params) {
    QueryWrapper<DictItem> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
