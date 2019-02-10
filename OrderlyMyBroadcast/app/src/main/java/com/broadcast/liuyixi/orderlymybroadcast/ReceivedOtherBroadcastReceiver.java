package com.broadcast.liuyixi.orderlymybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceivedOtherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Received 其他应用程序发送的广播",Toast.LENGTH_LONG).show();
    }
}
