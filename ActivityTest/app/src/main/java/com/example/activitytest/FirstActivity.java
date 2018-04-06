package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        switch(requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
                default:
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){//judge which menu option we click on
        case R.id.add_item:
            Toast.makeText(this,"You click Add",Toast.LENGTH_SHORT).show();
            break;
            case R.id.remove_item:
                Toast.makeText(this,"You click remove",Toast.LENGTH_SHORT).show();
                break;
            default:}
            return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){//设置一个监听器
            @Override
            //在活动销毁时返回一个结果给上一个活动
            public void onClick(View v)
            {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
            /*@Override
            //pass a string from Firstactivity to Secondactivity
            public void onClick(View v)
            {
                String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                //we can find in logcat that we successfully pass the String to secondanctivity
                startActivity(intent);
            }*/
           /* @Override
           //调用系统拨号界面
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }*/
           /* @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //setData(),acept a uri item
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }*/
            /*@Override
            public void onClick(View v){
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }*/
            /*explicit intent
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }*/
            /*public void onClick(View v){
                Toast.makeText(FirstActivity.this,"You click button 1", Toast.LENGTH_SHORT).show();
            }*/
           /*
           how to destory a activity
           @Override
            public void onClick(View v){
                finish();
           }
           */
        });
    }
}
