package com.itheima.playgame.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_num = (EditText) findViewById(R.id.et_num);
    }
    public void addNum(View view){
                Intent intent = new Intent();
                intent.setClass(this,ContactActivity.class);
                startActivityForResult(intent,1);
            }
            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                if(1==requestCode){
                    String num = data.getStringExtra("num");
                    et_num.setText(num);
        }
    }

}
