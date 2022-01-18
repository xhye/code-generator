package com.aegis.common.config.mybatisplus

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
import org.apache.ibatis.reflection.MetaObject
import org.springframework.stereotype.Component
import java.util.*


/**
 * MybatisPlus 默认填充
 * 用法 ：
 * @TableField("create_time", fill = FieldFill.INSERT)
 * @TableField("create_time", fill = FieldFill.UPDATE)
 * @TableField("create_user_id", fill = FieldFill.INSERT)
 * @TableField("update_user_id", fill = FieldFill.UPDATE)
 *
 * Created by yeqinhua on 2020/12/30.
 * @author yeqinhua
 * @since 0.0.1
 */
@Component
class MybatisPlusMetaObjectHandler : MetaObjectHandler {
  override fun insertFill(metaObject: MetaObject) {
    this.setFieldValByName("createTime", Date(), metaObject)
    // 通过 CurrentUser 获取用户 id 这里是代码生成器配置 实际情况根据项目同步
    this.setFieldValByName("createUserId", -1, metaObject)
  }

  override fun updateFill(metaObject: MetaObject) {
    this.setFieldValByName("updateTime", Date(), metaObject)
    // 通过 CurrentUser 获取用户 id 这里是代码生成器配置 实际情况根据项目同步
    this.setFieldValByName("updateUserId", -1, metaObject)
  }
}