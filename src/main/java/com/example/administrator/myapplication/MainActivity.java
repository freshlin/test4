package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MainActivity extends Activity implements Runnable{

    private int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int xx = 1;
        int yy = 2;
        int zz = 3;
        int qq = 4;
        int uu = 2;
        this.run();
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };



    @Override
    public void run() {

        x += 1;

        handler.postDelayed(this, 3000);

        Log.e("测试", String.valueOf(x));
    }
}
