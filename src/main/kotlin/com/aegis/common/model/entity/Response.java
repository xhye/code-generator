package com.aegis.common.model.entity;

import com.aegis.common.constant.ResponseCode;

/**
 * 所有接口返回前端 必须由Response封装返回
 */

public class Response<T> {
  private Integer code;
  private T data;
  private String msg;

  private Response() {
  }

  private Response(Integer _code, String _msg, T _data) {
    this.code = _code;
    this.msg = _msg;
    this.data = _data;
  }

  private Response(Integer _code, String _msg) {
    this.code = _code;
    this.msg = _msg;
  }

  private Response(ResponseCode responseCode) {
    this.code = responseCode.getCode();
    this.msg = responseCode.getMsg();
  }
  private static Response response(int code, String msg) {
    return new Response(code, msg);
  }

  public static Response fail() {
    return response(-1, "请求失败");
  }

  public static Response failWithResponseCode(ResponseCode responseCode) {
    return new Response(responseCode);
  }

  public static Response failWithException(Exception e) {
    return response(-1, e.getMessage());
  }


  public static Response success() {
    return response(0, "请求成功！");
  }

  public static <T> Response<T> successWithData(T data) {
    return new Response<>(0, "请求成功", data);
  }

  public static Response successWithMsg(String msg) {
    return response(0, msg);
  }

  public static Response successWithResponseCode(ResponseCode responseCode) {
    return new Response(responseCode);
  }


  public final Integer getCode() {
    return this.code;
  }

  public final void setCode(Integer code) {
    this.code = code;
  }

  public final T getData() {
    return this.data;
  }

  public final void setData(T data) {
    this.data = data;
  }

  public final String getMsg() {
    return this.msg;
  }

  public final void setMsg(String msg) {
    this.msg = msg;
  }
}

