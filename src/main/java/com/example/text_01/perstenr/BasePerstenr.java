package com.example.text_01.perstenr;

import com.example.text_01.view.inview.IMView;
import com.example.text_01.view.inview.Iview;

/**
 * Created by wangxiaoxiao on 2017/5/10.
 */

public class BasePerstenr<T extends IMView> {
    public  T mt;
    public void attchData(T manin){
        this.mt=manin;
    }

}
