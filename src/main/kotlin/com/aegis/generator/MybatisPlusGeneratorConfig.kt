package com.aegis.generator

import com.aegis.*
import com.baomidou.mybatisplus.annotation.DbType
import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.generator.AutoGenerator
import com.baomidou.mybatisplus.generator.InjectionConfig
import com.baomidou.mybatisplus.generator.config.*
import com.baomidou.mybatisplus.generator.config.po.TableFill
import com.baomidou.mybatisplus.generator.config.po.TableInfo
import com.baomidou.mybatisplus.generator.config.rules.DateType
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine
import java.util.*


/**
 * 初始化DTO VO
 * Created by yeqinhua on 2020/6/24.
 *
 * @author yeqinhua
 * @since 0.0.1
 */
/**
 * @param project 也就是项目名 可为空
 * @param project 模块名 不可为空
 * @param tables 需要生成的表名
 */
data class GeneratorConfig(var project: String, var module: String, var tables: List<String>)

object MybatisPlusGeneratorConfig {
  fun gen() {
    initBase()
    initMore()
  }

  private fun getDataSource(): DataSourceConfig {
    return DataSourceConfig()
        .setDbType(DbType.MYSQL)
        .setDriverName("com.mysql.cj.jdbc.Driver")
        .setUrl(url)
        .setUsername(username)
        .setPassword(password)
  }

  // 生成基础：controller、model、service、dao、mapper
  private fun initBase() {
    for (module in tables()) {
      for (item in module.tables) {
        startBase(module.project, module.module, item)
      }
    }
  }

  // 生成额外：vo、dto、pagedto、adddto
  private fun initMore() {
    for (module in tables()) {
      for (item in module.tables) {
        val types = mutableListOf("vo", "dto", "pagedto", "adddto")
        types.forEach {
          var path = basePackage
          if (module.project.isNotEmpty()) {
            path += ".${module.project}"
          }
          startMore(module.project, "$path.${module.module}", item, it, module.module)
        }
      }
    }
  }

  private fun startBase(project: String, module: String, table: String) {
    val templateType: String = if (codeType == "JAVA") {
      "java"
    } else {
      "kt"
    }
    val baseProjectPath = System.getProperty("user.dir")
    val gen = AutoGenerator()
    // 模板引擎
    gen.templateEngine = FreemarkerTemplateEngine()
//    // 指定模板
//    val templateConfig = TemplateConfig()
//        .setEntity("templates/entity2.$templateType")
//    gen.template = templateConfig
    /**
     * 数据库配置
     */
    gen.dataSource = getDataSource()
    /**
     * 全局配置
     */
    gen.globalConfig = GlobalConfig()
        .setOutputDir("$baseProjectPath/src/main/kotlin") //输出目录
        .setIdType(idType)
        .setFileOverride(cover) // 是否覆盖文件
        .setActiveRecord(false) // 开启 activeRecord 模式
        .setEnableCache(false) // XML 二级缓存
        .setSwagger2(true)
        .setBaseResultMap(true) // XML ResultMap
        .setBaseColumnList(true) // XML columList
        .setOpen(false) // 生成后打开文件夹
        .setAuthor("$codeType code generator")
        .setKotlin(codeType == "KOTLIN")
        .setDateType(DateType.ONLY_DATE)
        .setMapperName("%sMapper")
        .setXmlName("%sMapper")
        .setServiceName("%sService")
        .setServiceImplName("%sServiceImpl")
        .setControllerName("%sController")
    /**  策略配置 */
    val strategy = StrategyConfig() // .setCapitalMode(true)// 全局大写命名
        .setTablePrefix(prefix) // 此处可以修改为您的表前缀
        .setNaming(NamingStrategy.underline_to_camel) // 表名生成策略
        .setEntityLombokModel(false)
        .setEntityTableFieldAnnotationEnable(true)
        .setRestControllerStyle(true) //.setExclude(new String[]{"test"}) // 排除生成的表
        .setInclude(table) // 需要生成的表
        .setLogicDeleteFieldName("del") // 逻辑删除表字段

    // 配置默认填充
    val tableFills: MutableList<TableFill> = ArrayList()
    val createTime = TableFill("create_time", FieldFill.INSERT)
    val updateName = TableFill("update_time", FieldFill.UPDATE)
    val createUserId = TableFill("create_user_id", FieldFill.INSERT)
    val updateUserId = TableFill("update_user_id", FieldFill.UPDATE)
    tableFills.add(createTime)
    tableFills.add(updateName)
    tableFills.add(createUserId)
    tableFills.add(updateUserId)
    strategy.tableFillList = tableFills
    gen.strategy = strategy
    /**
     * 包配置
     */
    var path = basePackage
    if (project.isNotEmpty()) {
      path += ".${project}"
    }
    gen.packageInfo = PackageConfig() //.setModuleName("User")
        .setParent("$path.${module}") // 自定义包路径
        .setController("controller") // 这里是控制器包名，默认 web
        .setEntity("model.entity")
        .setMapper("dao")
        .setService("service")
        .setServiceImpl("service.impl")
        .setXml("dao.mapper")
    // 执行生成
    gen.execute()
  }

  private fun startMore(baseModule: String, path: String, table: String, type: String, common: String) {
    val baseProjectPath = System.getProperty("user.dir")
    val gen = AutoGenerator()
    // 模板引擎
    gen.templateEngine = FreemarkerTemplateEngine()
    val tc = TemplateConfig()
    tc.disable(
        TemplateType.CONTROLLER, TemplateType.SERVICE, TemplateType.MAPPER, TemplateType.XML, TemplateType.ENTITY
    )

    val templateType: String = if (codeType == "JAVA") {
      "java"
    } else {
      "kt"
    }
    //添加add 请求对象
    val foc: MutableList<FileOutConfig> = ArrayList()
    foc.add(object : FileOutConfig("/templates/$type.$templateType.ftl") {
      override fun outputFile(tableInfo: TableInfo): String? {
        return when (type) {
          "adddto"  -> {
            (baseProjectPath + "\\src\\main\\kotlin\\$baseDTOVOPath\\$baseModule\\$common\\model\\dto\\" + tableInfo.entityName + "AddOrUpdateDTO.$templateType")
          }
          "pagedto" -> {
            (baseProjectPath + "\\src\\main\\kotlin\\$baseDTOVOPath\\$baseModule\\$common\\model\\dto\\" + tableInfo.entityName + "PageDTO.$templateType")
          }
          else      -> {
            (baseProjectPath + "\\src\\main\\kotlin\\$baseDTOVOPath\\$baseModule\\$common\\model\\$type\\" + tableInfo.entityName + "${type.toUpperCase()}.$templateType")
          }
        }
      }
    })
    /**
     * 数据库配置
     */
    gen.dataSource = getDataSource()
    /**
     * 全局配置
     */
    gen.globalConfig = GlobalConfig()
        .setOutputDir("$baseProjectPath/src/main/kotlin") //输出目录
        .setIdType(idType)
        .setFileOverride(cover) // 是否覆盖文件
        .setActiveRecord(false) // 开启 activeRecord 模式
        .setEnableCache(false) // XML 二级缓存
        .setSwagger2(true)
        .setBaseResultMap(true) // XML ResultMap
        .setBaseColumnList(true) // XML columList
        .setOpen(false) // 生成后打开文件夹
        .setAuthor("$codeType code generator") // 自定义文件命名，注意 %s 会自动填充表实体属性！
        .setKotlin(codeType == "KOTLIN")
        .setDateType(DateType.ONLY_DATE)
    /**  策略配置 */
    val strategy = StrategyConfig()
        .setTablePrefix(prefix) // 此处可以修改为您的表前缀
        .setNaming(NamingStrategy.underline_to_camel) // 表名生成策略
        .setEntityLombokModel(false)
        .setEntityTableFieldAnnotationEnable(true)
        .setRestControllerStyle(true)
        .setInclude(table) // 需要生成的表
        .setLogicDeleteFieldName("del") // 逻辑删除表字段
    gen.strategy = strategy
    /**
     * 包配置
     */
    gen.packageInfo = PackageConfig() //.setModuleName("User")
        .setParent(path) // 自定义包路径
        .setEntity("model")
    // 设置模板
    gen.template = tc
    val ic: InjectionConfig = object : InjectionConfig() {
      override fun initMap() {
        map = map
      }
    }
    ic.fileOutConfigList = foc
    gen.cfg = ic
    // 执行生成
    gen.execute()
  }
}
