package com.deepjoshi.fragtask2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Red extends AppCompatActivity {
Button gr,blu,blk;
    Black black;
    Green green;
    Blue blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
        gr=(Button)findViewById(R.id.bt_green);
        blu=(Button)findViewById(R.id.bt_blue);
        blk=(Button)findViewById(R.id.bt_black);
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                green=new Green();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag_loc,green);
                ft.commit();
            }
        });
        blu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue=new Blue();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag_loc,blue);
                ft.commit();
            }
        });
        blk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                black=new Black();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag_loc,black);
                ft.commit();
            }
        });

    }
}
