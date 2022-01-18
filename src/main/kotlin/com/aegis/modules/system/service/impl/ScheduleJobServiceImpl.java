package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.ScheduleJob;
import com.aegis.modules.system.dao.ScheduleJobMapper;
import com.aegis.modules.system.service.ScheduleJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.ScheduleJobPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 定时任务 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobMapper, ScheduleJob> implements ScheduleJobService {
  @Override
  public IPage<ScheduleJob> listByEqCustomized(ScheduleJobPageDTO<ScheduleJob> params) {
    QueryWrapper<ScheduleJob> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
