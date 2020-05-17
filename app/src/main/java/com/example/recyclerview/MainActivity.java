package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //tối ưu hóa dữ liệu không bị ảnh hưởng bở nội dung trong adaper
    //        recyclerView.setHasFixedSize(true);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DienThoai> arrayList = new ArrayList<>();
        arrayList.add(new DienThoai(R.drawable.test,"IPHONE"));
        arrayList.add(new DienThoai(R.drawable.test,"IPHONE2"));
        arrayList.add(new DienThoai(R.drawable.test,"IPHONE3"));
        arrayList.add(new DienThoai(R.drawable.test,"IPHONE4"));
        arrayList.add(new DienThoai(R.drawable.test,"IPHONE5"));
        DienThoaiAdapter dienThoaiAdapter = new DienThoaiAdapter(arrayList,this);
        recyclerView.setAdapter(dienThoaiAdapter);

    }
}
