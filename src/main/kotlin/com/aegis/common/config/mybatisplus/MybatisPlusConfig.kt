package com.aegis.common.config.mybatisplus

import com.baomidou.mybatisplus.core.parser.ISqlParser
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize
import net.sf.jsqlparser.statement.delete.Delete
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*
/**
 * mybatis plus 分页注册
 * Created by yeqinhua on 2020-06-21.
 * @author yeqinhua
 * @since 1.0
 */
@Configuration
@EnableTransactionManagement
class MybatisPlusConfig {
  @Bean
  fun paginationInterceptor(): PaginationInterceptor {
    val paginationInterceptor = PaginationInterceptor()
    // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
    paginationInterceptor.setOverflow(false)
    // 设置最大单页限制数量，默认 500 条，-1 不受限制
    paginationInterceptor.setLimit(-1)
    // 开启 count 的 join 优化,只针对部分 left join
    paginationInterceptor.setCountSqlParser(JsqlParserCountOptimize(true))
    val sqlParserList: MutableList<ISqlParser> = ArrayList()
    // 攻击 SQL 阻断解析器、加入解析链
    sqlParserList.add(object : BlockAttackSqlParser() {
      override fun processDelete(delete: Delete) { // 如果你想自定义做点什么，可以重写父类方法像这样子
        if ("t_sys_demo" == delete.table.name) { // 自定义跳过某个表，其他关联表可以调用 delete.getTables() 判断
          return
        }
        super.processDelete(delete)
      }
    })
    paginationInterceptor.sqlParserList = sqlParserList
    return paginationInterceptor
  }
}