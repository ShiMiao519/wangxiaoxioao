package com.example.text_01.view.activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.text_01.R;
import com.example.text_01.model.Bean;
import com.example.text_01.perstenr.HolderPerstenr;
import com.example.text_01.view.apadter.MyBase;
import com.example.text_01.view.inview.IMView;
import com.example.text_01.view.inview.Iview;

public class MainActivity extends AppCompatActivity implements Iview<Bean>{

    private ListView list_view;
    private MyBase myBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("dddd","===============");

         initView();
        initData();


    }

    private void initView() {

        list_view = (ListView) findViewById(R.id.list_view);
    }

    private void initData() {
        HolderPerstenr holderPerstenr = new HolderPerstenr();
        holderPerstenr.attchData(this);

        myBase = new MyBase(this);
        list_view.setAdapter(myBase);
        myBase.getP(holderPerstenr);



        holderPerstenr.getService(Bean.class);
    }


    @Override
    public void callback(Bean data) {

       myBase.getData(data.getResult().getData());
        myBase.notifyDataSetChanged();

    }
}
