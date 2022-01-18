package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.ScheduleJob;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.ScheduleJobDTO;
import com.aegis.modules.system.model.dto.ScheduleJobPageDTO;
import com.aegis.modules.system.model.vo.ScheduleJobVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 定时任务 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface ScheduleJobMapper extends BaseMapper<ScheduleJob> {
  /**
  * 查询列表-无分页
  */
  List<ScheduleJobVO> listNoPage(ScheduleJobDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<ScheduleJobVO> listWithPage(ScheduleJobPageDTO<ScheduleJobVO> params);
}
