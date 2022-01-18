package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.ScheduleJobLog;
import com.aegis.modules.system.dao.ScheduleJobLogMapper;
import com.aegis.modules.system.service.ScheduleJobLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.ScheduleJobLogPageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 * 定时任务日志 业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogMapper, ScheduleJobLog> implements ScheduleJobLogService {
  @Override
  public IPage<ScheduleJobLog> listByEqCustomized(ScheduleJobLogPageDTO<ScheduleJobLog> params) {
    QueryWrapper<ScheduleJobLog> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
