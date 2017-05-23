package com.example.text_01.model.utils;

import com.example.text_01.model.Bean;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wangxiaoxiao on 2017/5/11.
 */

public class MyUtils {

    public static <T>void  getInto(String url, HashMap<String, String > hashMap, final getMy getmy, final Class<T> clazz){

        RequestParams params=new RequestParams();
        params.setUri(url);
        if (hashMap !=null){
            Iterator<String> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()){
                String key = iterator.next();
                String value = hashMap.get(key);
                params.addQueryStringParameter(key,value);
            }
        }


        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                T t = gson.fromJson(result, clazz);
                getmy.callBack(t);

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }
    public interface  getMy<T>{
        void callBack(T t);
    };
}
