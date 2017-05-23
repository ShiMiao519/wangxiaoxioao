package com.example.text_01.view.inview;

import com.example.text_01.model.Bean;

/**
 * Created by wangxiaoxiao on 2017/5/10.
 */

public interface Iview<T> extends  IMView{

    void  callback(T data);
}
