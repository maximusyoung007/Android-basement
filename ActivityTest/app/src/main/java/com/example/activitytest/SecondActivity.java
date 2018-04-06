package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data-return","Hello FirstActivity");
        setResult(RESULT_OK,intent);//向上一个活动返回处理结果
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        //get data passed by Firstactivity
       /* Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);*/
       Button button2 = (Button) findViewById(R.id.button_2);
       button2.setOnClickListener(new View.OnClickListener() {//给按钮2注册点击事件
           @Override
           public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return","Hello FirstActivity");
                setResult(RESULT_OK,intent);//向上一个活动返回处理结果
                finish();
           }
       });
    }
}
