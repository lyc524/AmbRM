package com.lz.www.ambrm.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.lz.www.ambrm.Service.MyService;

/**
 * Created by Administrator on 2016/5/28.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"接收到了广播",Toast.LENGTH_SHORT).show();
//        Intent it=new Intent(context, MyService.class);
//        context.startService(it);
    }
}
