<#if kotlin>
package ${package.ServiceImpl}

import ${package.Entity}.${entity}
import ${package.Mapper}.${table.mapperName}
import ${package.Service}.${table.serviceName}
import ${superServiceImplClassPackage}
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO
import com.aegis.common.utils.MybatisPlusUtil.createQueryWrapper
import org.springframework.stereotype.Service
import com.baomidou.mybatisplus.core.metadata.IPage
import com.aegis.common.utils.MybatisPlusUtil.handleQuery
<#else>
package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aegis.common.utils.MybatisPlusUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
</#if>


/**
 * ${table.comment!} 业务类接口实现
 *
 * Created by ${author} on ${date}.
 * @author ${author}
 * @since 1.0
 */
@Service
<#if kotlin>
class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

  override fun listByEqCustomized(params: ${entity}PageDTO<${entity}>): IPage<${entity}> {
    val queryWrapper = createQueryWrapper<${entity}>()
    handleQuery(params.query, queryWrapper)
    return baseMapper.selectPage(params, queryWrapper)
  }
}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
  @Override
  public IPage<${entity}> listByEqCustomized(${entity}PageDTO<${entity}> params) {
    QueryWrapper<${entity}> queryWrapper = MybatisPlusUtil.createQueryWrapper();
    MybatisPlusUtil.handleQuery(params.getQuery(), queryWrapper);
    return baseMapper.selectPage(params, queryWrapper);
  }
}
</#if>
