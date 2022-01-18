package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.DictDTO;
import com.aegis.modules.system.model.dto.DictPageDTO;
import com.aegis.modules.system.model.vo.DictVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 字典类型表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface DictMapper extends BaseMapper<Dict> {
  /**
  * 查询列表-无分页
  */
  List<DictVO> listNoPage(DictDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<DictVO> listWithPage(DictPageDTO<DictVO> params);
}
