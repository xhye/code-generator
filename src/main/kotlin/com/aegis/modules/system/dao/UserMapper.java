package com.aegis.modules.system.dao;

import java.util.List;
import com.aegis.modules.system.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aegis.modules.system.model.dto.UserDTO;
import com.aegis.modules.system.model.dto.UserPageDTO;
import com.aegis.modules.system.model.vo.UserVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户表 Mapper 接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface UserMapper extends BaseMapper<User> {
  /**
  * 查询列表-无分页
  */
  List<UserVO> listNoPage(UserDTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<UserVO> listWithPage(UserPageDTO<UserVO> params);
}
