package com.lz.www.ambrm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lz.www.ambrm.Service.BgMusicService;
import com.lz.www.ambrm.model.Contacts;
import com.lz.www.ambrm.model.HttpResponse;
import com.lz.www.ambrm.net.HttpService;
import com.lz.www.ambrm.ui.HomeActivity;
import com.lz.www.ambrm.ui.ScheduleActivity;
import com.lz.www.ambrm.ui.ScheduleViewActivity;
import com.lz.www.ambrm.util.CommonUtils;
import com.lz.www.ambrm.util.Config;
import com.lz.www.ambrm.util.JsonUtils;
import com.lz.www.ambrm.util.SPUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ContentResolver resolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resolver = getContentResolver();

        Button btnOpenLogin=(Button)findViewById(R.id.btnOpenLogin);
        btnOpenLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(it);
            }
        });

        Button btnTest=(Button)findViewById(R.id.btnTestAA);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ContentValues values=new ContentValues();
//                values.put("Source","[Test]");
//                values.put("Content","this is a test");
//                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//                values.put("AddTime",df.format(new Date()));
//                resolver.insert(Config.AMBLOG_URI, values);
//                Toast.makeText(MainActivity.this,"添加成功",Toast.LENGTH_SHORT).show();

                //SPUtils.put(MainActivity.this,"test","我是测试");

                //启动service
                Intent intent=new Intent(MainActivity.this,BgMusicService.class);
                startService(intent);

            }
        });


        final TextView textView=(TextView)findViewById(R.id.tvTestView);

        Button btnQuery=(Button)findViewById(R.id.btnTestQuery);
        btnQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Cursor cursor=resolver.query(Config.AMBLOG_URI,null,null,null,null);
//                String result="";
//                while (cursor.moveToNext()) {
//                    String id = cursor.getString(cursor.getColumnIndex("ID"));
//                    String Source = cursor.getString(cursor.getColumnIndex("Source"));
//                    String content = cursor.getString(cursor.getColumnIndex("Content"));
//                    String time = cursor.getString(cursor.getColumnIndex("AddTime"));
//                    result += "id=" + id + "; Source=" + Source + "; content=" + content + "; time=" + time + "; ";
//                }
//                if("".equals(result)){
//                    textView.setText("没有记录");
//                }else {
//                    textView.setText(result);
//                }

//               Object time = SPUtils.get(MainActivity.this,"ScheduleTime","0");
//                Object content=SPUtils.get(MainActivity.this,"ScheduleContent","0");
//                Toast.makeText(MainActivity.this,time.toString()+" "+content.toString(),Toast.LENGTH_SHORT).show();

//                //定时提醒
//                Intent it=new Intent(MainActivity.this,ScheduleViewActivity.class);
//                it.putExtra("content","hahahaha");
//
//                PendingIntent pi=PendingIntent.getActivity(MainActivity.this,0,it,0);
//
//                AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
//
//                long sTimes=0;
//                try {
//                    Date sTime= CommonUtils.ConverToDate("2016-7-11 16:22:00");
//                    sTimes=sTime.getTime();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                alarmManager.set(AlarmManager.RTC_WAKEUP,sTimes,pi);
//
//                Toast.makeText(MainActivity.this,"定义闹钟完成",Toast.LENGTH_SHORT).show();


                //停止service
                Intent intent=new Intent(MainActivity.this,BgMusicService.class);
                stopService(intent);
            }
        });

    }


}
