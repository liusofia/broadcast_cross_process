package com.broadcast.liuyixi.orderlymybroadcast;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//该实例验证一个应用发送广播另一个应用跨进程可以收到广播消息
//有序广播前提是可以两个应用都收到同一个广播消息
public class MainActivity extends AppCompatActivity {

    private IntentFilter mIntentFilter;
    ReceivedOtherBroadcastReceiver mBroadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mIntentFilter = new IntentFilter();
//        mBroadcastReceiver = new ReceivedOtherBroadcastReceiver();
//        com.broadcast.liuyixi.mybroadcastreceiver.My_Broadcast
//        mIntentFilter.addAction("com.broadcast.liuyixi.mybroadcastreceiver.My_Broadcast");
//        registerReceiver(mBroadcastReceiver,mIntentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(mBroadcastReceiver);
    }
}
