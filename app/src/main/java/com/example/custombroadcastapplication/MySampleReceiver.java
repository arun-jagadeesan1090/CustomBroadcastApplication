package com.example.custombroadcastapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MySampleReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if("com.CodingBroadcastTraining.EXAMPLE_ACTION".equals(intent.getAction())){
            String receivedText = intent.getStringExtra("com.CodingBroadcastTraining.Extra_TXT");
            Toast.makeText(context,receivedText,Toast.LENGTH_LONG).show();
        }
    }
}
