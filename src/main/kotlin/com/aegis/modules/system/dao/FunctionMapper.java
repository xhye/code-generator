package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Function;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.FunctionDTO;
import com.aegis.modules.system.model.dto.FunctionPageDTO;
import com.aegis.modules.system.model.vo.FunctionVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 系统模块或者方法 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface FunctionMapper extends BaseMapper<Function> {
  /**
  * 查询列表-无分页
  */
  List<FunctionVO> listNoPage(FunctionDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<FunctionVO> listWithPage(FunctionPageDTO<FunctionVO> params);
}
