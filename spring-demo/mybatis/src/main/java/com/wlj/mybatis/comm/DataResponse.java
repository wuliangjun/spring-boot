package com.wlj.mybatis.comm;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 16:13
 * @history: 1.2020/2/17 created by liangjun.wu
 */
public class DataResponse<T> {
    private ResponseCode code;
    private String message;
    private String requestId;
    private T data;

    public DataResponse() {
        this.code = ResponseCode.ok;
    }

    public DataResponse(ResponseCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public static DataResponse ok() {
        return new DataResponse();
    }

    public static <T> DataResponse ok(T t) {
        return ok().data(t);
    }

    public DataResponse data(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static DataResponse error(String message) {
        return new DataResponse(ResponseCode.error, message);
    }

    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}