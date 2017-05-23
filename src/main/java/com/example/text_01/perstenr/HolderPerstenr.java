package com.example.text_01.perstenr;


import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.text_01.model.Bean;
import com.example.text_01.model.utils.MyUtils;
import com.example.text_01.view.activty.MainActivity;
import com.example.text_01.view.inview.Iview;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxiaoxiao on 2017/5/10.
 */

public class HolderPerstenr extends BasePerstenr<Iview>{
      private   String url="http://apis.juhe.cn/cook/query.php";

      HashMap<String,String> hasmap=new HashMap<>();

//        params.addQueryStringParameter("key","34689251284051bcf818c8fdd7f37303");
//        params.addQueryStringParameter("menu","水煮鱼");
      public <T>void getService(Class<T> t){
          hasmap.put("key","34689251284051bcf818c8fdd7f37303");
          hasmap.put("menu","水煮鱼");
        MyUtils.getInto(url, hasmap, new MyUtils.getMy<T>() {
            @Override
            public void callBack(T t) {
             mt.callback(t);
            }
        },t);

    }
    public void  getImage(ImageView imageView,String url){
        x.image().bind(imageView,url);
    }

}
