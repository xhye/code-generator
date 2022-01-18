package com.aegis.modules.system.service;

import com.aegis.modules.system.model.entity.UserModule;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aegis.modules.system.model.dto.UserModulePageDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 用户项目/模块表 业务接口
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
public interface UserModuleService extends IService<UserModule> {

  /**
  * 固定参数精准查询分页、不分页列表
  * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
  * 如果不需要分页 current 传 -1
  * @param params 参数
  */
  IPage<UserModule> listByEqCustomized(UserModulePageDTO<UserModule> params);
}
