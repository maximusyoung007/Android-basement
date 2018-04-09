package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Context;


public class SecondActivity extends BaseActivity {
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("SecondActivity","onDestory");
    }
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
        Log.d("SecondActivity","Task id is" + getTaskId());
        setContentView(R.layout.secondlayout);
        //get data passed by Firstactivity
       /* Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);*/
       Button button2 = (Button) findViewById(R.id.button_2);
       button2.setOnClickListener(new View.OnClickListener() {//给按钮2注册点击事件
           @Override
           public void onClick(View v){
               Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
               startActivity(intent);
           }
           /*@Override
           public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return","Hello FirstActivity");
                setResult(RESULT_OK,intent);//向上一个活动返回处理结果
                finish();
           }*/
       });
    }
}
