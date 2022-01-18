package com.aegis

import com.aegis.generator.GeneratorConfig
import com.aegis.generator.MybatisPlusGeneratorConfig.gen
import com.baomidou.mybatisplus.annotation.IdType
import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.system.exitProcess

/**
 * 代码生成器主方法和主要配置
 *
 * Created by yeqinhua on 2020/6/17.
 * @author yeqinhua
 * @since 1.0
 */

/**
 * 必须配置项
 */
// table 前缀
const val prefix = "t_sys_"

// 需要生成代码的父包 根据项目匹配（适配旧项目，新项目必须按此包配置）
const val basePackage = "com.aegis.modules"

// DTO VO 文件路径
const val baseDTOVOPath = "com\\aegis\\modules"

// 每次生成是否覆盖旧代码（删除旧的，重新生成）
const val cover = true

// 主键类型
val idType = IdType.ASSIGN_ID // IdType.AUTO: 默认自增  ASSIGN_ID：雪花主键

// 生成代码类型
const val codeType = "JAVA" // JAVA KOTLIN

/**
 * 数据库配置
 */
const val url = "jdbc:mysql://127.0.0.1:3306/demo?useSSL=false&useTimezone=true&serverTimezone=GMT%2B8"
const val username = "root"
const val password = "123456"

/**
 *  需要生成代码的表配置
 */
fun tables(): List<GeneratorConfig> {
  val list = mutableListOf<GeneratorConfig>()
  list.add(GeneratorConfig("", "system", mutableListOf(
    "t_sys_dict",
    "t_sys_dict_item",
    "t_sys_function",
    "t_sys_grant",
    "t_sys_group",
    "t_sys_group_role",
    "t_sys_group_user",
    "t_sys_log",
    "t_sys_menu",
    "t_sys_module",
    "t_sys_organization",
    "t_sys_role",
    "t_sys_role_function",
    "t_sys_role_menu",
    "t_sys_schedule_job",
    "t_sys_schedule_job_log",
    "t_sys_user",
    "t_sys_user_module",
    "t_sys_user_organization",
    "t_sys_user_role",
    "t_sys_file"
  )))
  if (list.isEmpty()) {
    throw Exception("代码生成配置错误")
  }
  return list
}


/**
 * 启动类
 * 配置完毕后,直接运行运行此方法生成代码
 *
 */
@SpringBootApplication
@MapperScan(basePackages = ["com.aegis.modules.*.dao"]) // mapper 扫描
class CodeGeneratorApplication

fun main(args: Array<String>) {
//  gen()
  println("=====================代码生成成功,准备开始检测代码===========================")
  println("=====================代码运行检测开始===========================")
  runApplication<CodeGeneratorApplication>(*args)
  println("=====================代码运行检测结束===========================")
  exitProcess(1)
}