package org.qitmeer.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.qitmeer.model.RecJson;
import org.qitmeer.model.ServiceResult;

public class QitmeerUtil {

    public static ServiceResult pareRec(String rec){
        if(rec == null){
            return ServiceResult.fail(-1,"通讯失败!");
        }
        JSONObject ob = JSON.parseObject(rec);
        JSONObject error = ob.getJSONObject("error");
        if (error!=null){
            return ServiceResult.fail(error.getIntValue("code"),error.getString("message"));
        }else{
            String result = ob.getString("result");
            if (result!=null&&!result.equals("")){
                return ServiceResult.succ(result);
            }else{
                return ServiceResult.fail(-1,"数据错误");
            }

        }
    }
}
