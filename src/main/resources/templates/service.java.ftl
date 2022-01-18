<#if kotlin>
package ${package.Service}

import ${package.Entity}.${entity}
import ${superServiceClassPackage}
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO
import com.baomidou.mybatisplus.core.metadata.IPage
<#else>
package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;
</#if>

/**
 * ${table.comment!} 业务接口
 *
 * Created by ${author} on ${date}.
 * @author ${author}
 * @since 1.0
 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}> {

  /**
   * 固定参数精准查询分页、不分页列表
   * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
   * 如果不需要分页 current 传 -1
   * @param params 参数
   */
  fun listByEqCustomized(params: ${entity}PageDTO<${entity}>): IPage<${entity}>
}
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

  /**
  * 固定参数精准查询分页、不分页列表
  * 都会遍历为 wrapper eq/ne/gt/ge/lt/le/like/orderBy (key,value)
  * 如果不需要分页 current 传 -1
  * @param params 参数
  */
  IPage<${entity}> listByEqCustomized(${entity}PageDTO<${entity}> params);
}
</#if>
