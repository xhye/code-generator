package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.LogDTO;
import com.aegis.modules.system.model.dto.LogPageDTO;
import com.aegis.modules.system.model.vo.LogVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface LogMapper extends BaseMapper<Log> {
  /**
  * 查询列表-无分页
  */
  List<LogVO> listNoPage(LogDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<LogVO> listWithPage(LogPageDTO<LogVO> params);
}
