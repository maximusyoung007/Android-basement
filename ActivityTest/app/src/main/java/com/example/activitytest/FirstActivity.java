package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
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
            public void onClick(View v){
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }
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
