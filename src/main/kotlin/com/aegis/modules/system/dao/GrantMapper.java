package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.Grant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.GrantDTO;
import com.aegis.modules.system.model.dto.GrantPageDTO;
import com.aegis.modules.system.model.vo.GrantVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 授权表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface GrantMapper extends BaseMapper<Grant> {
  /**
  * 查询列表-无分页
  */
  List<GrantVO> listNoPage(GrantDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<GrantVO> listWithPage(GrantPageDTO<GrantVO> params);
}
