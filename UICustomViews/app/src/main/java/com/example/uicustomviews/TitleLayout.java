package com.example.uicustomviews;

/**
 * Created by Administrator on 2018/4/11.
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.app.Activity;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context,AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"You click Edit button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
