package org.qitmeer.model;

import java.util.List;

public class SendJson {
    public String id;
    public String method;
    public String jsonrpc;
    public List<Object> params;
    public SendJson(String method,List<Object>  params){
        this.id="1";
        this.method=method;
        this.jsonrpc="jsonrpc";
        this.params=params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public List<Object> getParams() {
        return params;
    }

    public void setParams(List<Object> params) {
        this.params = params;
    }
}
