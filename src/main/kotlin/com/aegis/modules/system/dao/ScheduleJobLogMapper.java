package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.ScheduleJobLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.ScheduleJobLogDTO;
import com.aegis.modules.system.model.dto.ScheduleJobLogPageDTO;
import com.aegis.modules.system.model.vo.ScheduleJobLogVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 定时任务日志 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface ScheduleJobLogMapper extends BaseMapper<ScheduleJobLog> {
  /**
  * 查询列表-无分页
  */
  List<ScheduleJobLogVO> listNoPage(ScheduleJobLogDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<ScheduleJobLogVO> listWithPage(ScheduleJobLogPageDTO<ScheduleJobLogVO> params);
}
