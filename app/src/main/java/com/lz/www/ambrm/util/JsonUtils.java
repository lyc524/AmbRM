package com.lz.www.ambrm.util;

import com.lz.www.ambrm.model.HttpResponse;
import com.lz.www.ambrm.model.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-07-01.
 */
public class JsonUtils {

    public static HttpResponse parseJson(String jsonData) {
        HttpResponse r = new HttpResponse();
        List<User> uList = null;
        try {
            uList = new ArrayList<User>();
            //"{\"code\":\"0\",\"msg\":\"成功\",\"count\":\"1\",\"data\":\"[{\"ID\":0,\"UserCode\":\"lz\",\"UserName\":null,\"Password\":\"123\",\"Mobile\":\"12557\",\"SBU\":null}]\"}"
            String jsonStr= "{\"code\":\"0\",\"msg\":\"成功\",\"count\":\"1\",\"data\":[{\"ID\":0,\"UserCode\":\"lz\",\"UserName\":null,\"Password\":\"123\",\"Mobile\":\"12557\",\"SBU\":null}]}";
//            String jsonStr= "{\"username\":\"张木生\",age:11,\"jicheng\":[{\"zhengshu\":\"PMP\",\"date\":\"2011年\"},{\"zhengshu\":\"信息系统项目管理师\",\"date\":\"2012年\"}],\"addr\":\"江西\"}";
            JSONObject jsonObject = new JSONObject(jsonStr);

            JSONArray jsonArray=jsonObject.getJSONArray("data");
//            String code=jsonObject.getString("code");
//            String msg = jsonObject.getString("msg");
//            String count=jsonObject.getString("count");
//            String data = jsonObject.getString("data");
            for (int i = 0; i < jsonArray.length(); i++) {
                User u=new User();
                JSONObject o = jsonArray.getJSONObject(i);
                u.setUserCode(o.getString("UserCode"));
                u.setUserName(o.getString("UserName"));
                u.setPassword(o.getString("Password"));
                uList.add(u);
            }
            r.setCode(jsonObject.getString("code"));
            r.setCount(jsonObject.getString("count"));
            r.setList(uList);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
}
