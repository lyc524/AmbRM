package com.lz.www.ambrm.Service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;

import com.lz.www.ambrm.Broadcast.ScheduleBoradcastReceiver;

import java.util.Date;

/**
 * Created by Administrator on 2016-07-09.
 */
public class ScheduleService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //业务逻辑
                Log.d("ScheduleService", "excute at "+new Date().toString());
            }
        }).start();

        AlarmManager manager=(AlarmManager)getSystemService(ALARM_SERVICE);
        int anHour=60*60*1000;
        long triggerAtTime= SystemClock.elapsedRealtime()+anHour;
        Intent i=new Intent(this, ScheduleBoradcastReceiver.class);
        PendingIntent pi=PendingIntent.getBroadcast(this,0,i,0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        return super.onStartCommand(intent, flags, startId);
    }
}
