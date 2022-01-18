package com.aegis.common.constant
/**
 * 全局错误码
 * 所有返回文字信息和code必须在此定义
 */
enum class ResponseCode(val code: Int, val msg: String) {
  SYSTEM_BUSY(40001, "系统繁忙"),
  USER_DISABLED(40002, "账号被禁用"),
  LOGIN_TIMEOUT(40003, "登录超时"),
  GET_VERIFICATION_CODE_TOO_OFTEN(40004, "获取验证码过于频繁"),
  GET_VERIFICATION_CODE_ERROR(40005, "获取验证码失败"),
  INVALID_VERIFICATION_CODE(40006, "验证码错误"),
  UN_EXIST_USERNAME(40007, "用户名不存在"),
  INVALID_PASSWORD(40008, "密码错误"),
  INVALID_ACCESS(40009, "非法访问"),
  INVALID_CERTIFICATE_ID(40010, "身份证号错误"),
  EXIST_CERTIFICATE_ID(40011, "证件号已存在"),
  FAIL_ON_UPLOAD(40012, "上传文件失败"),
  UNSUPPORTED_FILE_TYPE(40013, "不支持的文件类型"),
  FILE_SIZE_OVER_LIMIT(40014, "文件体积过大"),
  PARAM_NOT_SEND(40015, "参数不完整"),
  NOT_CURRENT_WORK_USER(40016, "你不是当前企业用户"),
  EXIST_USERNAME(40017, "账号已存在"),
  PARAM_KEY_ERROR(40018, "查询参数拼接有误"),
  NOT_SUPPORT_DIRECT(40019, "不支持的指令"),
  NOT_BIND_ROLE(40020, "用户未绑定角色信息"),
  NOT_BIND_ORG(40021, "用户未绑定机构信息"),
  ACCOUNT_LOCKED(40022, "账号被锁定，请稍后重试"),
  INVALID_OLD_PASSWORD(40023, "请输入正确的旧密码"),
  CASE_APPLY_ERROR(40025, "提交失败,请联系系统管理员"),
  CASE_PROGRESS_ERROR(40026, "操作失败,请刷新浏览器重试")
}
