package com.aegis.modules.system.service.impl;

import com.aegis.modules.system.model.entity.File;
import com.aegis.modules.system.dao.FileMapper;
import com.aegis.modules.system.service.FileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aegis.modules.system.model.dto.FilePageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


/**
 *  业务类接口实现
 *
 * Created by JAVA code generator on 2021-12-15.
 * @author JAVA code generator
 * @since 1.0
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {
  @Override
  public IPage<File> listByEqCustomized(FilePageDTO<File> params) {
    QueryWrapper<File> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
