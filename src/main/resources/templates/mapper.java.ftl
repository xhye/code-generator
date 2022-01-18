<#if kotlin>
package ${package.Mapper}

import ${package.Entity}.${entity}
import ${superMapperClassPackage}
import ${package.Entity?replace("entity","dto")}.${entity}DTO
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO
import ${package.Entity?replace("entity","vo")}.${entity}VO
import com.baomidou.mybatisplus.core.metadata.IPage
<#else>
package ${package.Mapper};

import java.util.List;
import ${package.Entity}.${entity};
import ${superMapperClassPackage};
import ${package.Entity?replace("entity","dto")}.${entity}DTO;
import ${package.Entity?replace("entity","dto")}.${entity}PageDTO;
import ${package.Entity?replace("entity","vo")}.${entity}VO;
import com.baomidou.mybatisplus.core.metadata.IPage;
</#if>

/**
 * ${table.comment!} Mapper 接口
 *
 * Created by ${author} on ${date}.
 * @author ${author}
 * @since 1.0
 */
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}> {

 /**
 * 查询列表-无分页
 */
 fun listNoPage(params: ${entity}DTO): MutableList<${entity}VO>

 /**
 * 分页查询-有分页
 * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
 */
 fun listWithPage(params: ${entity}PageDTO<${entity}VO>): IPage<${entity}VO>

}
<#else>
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {
  /**
  * 查询列表-无分页
  */
  List<${entity}VO> listNoPage(${entity}DTO params);

  /**
  * 分页查询-有分页
  * 说明：自动分页page必须放在第一位(需要继承BasePageDTO)
  */
  IPage<${entity}VO> listWithPage(${entity}PageDTO<${entity}VO> params);
}
</#if>