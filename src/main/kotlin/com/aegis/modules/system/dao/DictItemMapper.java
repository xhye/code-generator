package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.DictItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.DictItemDTO;
import com.aegis.modules.system.model.dto.DictItemPageDTO;
import com.aegis.modules.system.model.vo.DictItemVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 字典项数据表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface DictItemMapper extends BaseMapper<DictItem> {
  /**
  * 查询列表-无分页
  */
  List<DictItemVO> listNoPage(DictItemDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<DictItemVO> listWithPage(DictItemPageDTO<DictItemVO> params);
}
