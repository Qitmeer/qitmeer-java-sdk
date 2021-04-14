package org.qitmeer.model;

public class ServiceResult {
    public int code;
    public String msg;
    public Object data;

    public ServiceResult() {
    }

    public ServiceResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ServiceResult succ(Object data) {
        return new ServiceResult(0, "成功", data);
    }

    public static ServiceResult fail(int code, String msg) {
        return new ServiceResult(code, msg, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
