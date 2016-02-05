package com.apphunger.chobo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        List<TasteVO> list = new ArrayList<TasteVO>();




        List<TasteVO> response = new ArrayList<TasteVO>();


        for(int i=0;i<response.size();i++) {
            TasteVO test1 = new TasteVO();

            test1.setMapdata("Seoul...");
            test1.setName("삼통치킨");
            test1.setAvg(4.5f);
            test1.setRegdate("20160203");
            test1.setLike(300);
            test1.setTel("02-0000-0202");

            list.add(test1);
        }
    }
}
