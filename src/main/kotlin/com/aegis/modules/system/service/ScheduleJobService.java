package com.aegis.modules.system.service;

import com.aegis.modules.system.model.entity.ScheduleJob;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aegis.modules.system.model.dto.ScheduleJobPageDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 定时任务 业务接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface ScheduleJobService extends IService<ScheduleJob> {

  /**
  * 固定参数精准查询分页、不分页列表
  * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
  * 如果不需要分页 current 传 -1
  * @param params 参数
  */
  IPage<ScheduleJob> listByEqCustomized(ScheduleJobPageDTO<ScheduleJob> params);
}