package com.example.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//两种写法实现对按钮点击事件的监听
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        /*button.setOnClickListener(new View.OnClickListener() {//匿名类
            @Override
            public void onClick(View view) {

            }
        });*/
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                //logic
                break;
            default:
                break;
        }
    }
}
