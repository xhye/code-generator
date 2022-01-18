package com.aegis.common.utils;

import com.aegis.common.constant.ResponseCode;
import com.aegis.common.exception.ControllerException;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

import java.util.Map;

/**
 * Mybatis-Plus Util
 * <p>
 * Created by yeqinhua on 2020/06/23.
 *
 * @author yeqinhua
 * @since 1.0
 */
public final class MybatisPlusUtil {

  public static <T> QueryWrapper<T> createQueryWrapper() {
    return new QueryWrapper<>();
  }

  public static <T> UpdateWrapper<T> createUpdateWrapper() {
    return new UpdateWrapper<>();
  }

  public static <T> void handleQuery(Map<String, ?> query, QueryWrapper<T> queryWrapper) {
    query.keySet().forEach(key -> {
      if (!key.contains(",")) {
        throw new ControllerException(ResponseCode.PARAM_KEY_ERROR.getMsg());
      }
      String[] keys = key.split(",");
      Object value = query.get(key);
      queryWrapperPlus(keys[0], keys[1], value, queryWrapper);
    });
  }

  public static <T> void queryWrapperPlus(String key, String direct, Object value, QueryWrapper<T> queryWrapper) {
    switch (direct) {
      case "orderBy":
        boolean temp = (Boolean) value;
        if (temp) {
          queryWrapper.orderByAsc(key);
        } else {
          queryWrapper.orderByDesc(key);
        }
        return;
      case "eq":
        queryWrapper.eq(key, value);
        return;
      case "ge":
        queryWrapper.ge(key, value);
        return;
      case "gt":
        queryWrapper.gt(key, value);
        return;
      case "le":
        queryWrapper.le(key, value);
        return;
      case "lt":
        queryWrapper.lt(key, value);
        return;
      case "ne":
        queryWrapper.ne(key, value);
        return;
      case "date":
        queryWrapper.eq("DATE_FORMAT(" + key + ",'%Y-%m')", value);
        return;
      case "like":
        queryWrapper.like(key, value);
        return;
    }
    throw new ControllerException(ResponseCode.NOT_SUPPORT_DIRECT.getMsg());
  }
}
