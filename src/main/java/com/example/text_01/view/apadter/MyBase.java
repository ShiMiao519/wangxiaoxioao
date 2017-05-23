package com.example.text_01.view.apadter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.text_01.R;
import com.example.text_01.model.Bean;
import com.example.text_01.perstenr.HolderPerstenr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxiaoxiao on 2017/5/10.
 */

public class MyBase extends BaseAdapter{
    private HolderPerstenr holderPerstenr;
    private Context context;

    private List<Bean.ResultBean.DataBean> list=new ArrayList<>();

    public MyBase(Context context){
        this.context=context;

     }
     public void  getP(HolderPerstenr per){
         this.holderPerstenr=per;
     }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder=null;
        if (convertView==null){
            holder = new Holder();
            Log.e("dddd","===============");
            convertView=View.inflate(context, R.layout.list,null);
         holder.text_01= (TextView) convertView.findViewById(R.id.text_01);
          holder.imsge_01= (ImageView) convertView.findViewById(R.id.im_01);
            convertView.setTag(holder);
        }else {
           holder= (Holder) convertView.getTag();
        }
        holder.text_01.setText(list.get(position).getTags());
       holderPerstenr.getImage(holder.imsge_01,list.get(position).getAlbums().get(0));
        return convertView;
    }
    public void  getData(List<Bean.ResultBean.DataBean> list){
        if (list !=null){
            this.list.addAll(list);
        }
    }
    static  class  Holder{
        TextView text_01;
        ImageView imsge_01;

    }
}
