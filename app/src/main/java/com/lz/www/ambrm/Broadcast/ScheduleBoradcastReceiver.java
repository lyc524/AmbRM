package com.lz.www.ambrm.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.lz.www.ambrm.Service.ScheduleService;

/**
 * Created by Administrator on 2016-07-09.
 */
public class ScheduleBoradcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
         Intent it=new Intent(context, ScheduleService.class);
        context.startService(it);
    }
}
