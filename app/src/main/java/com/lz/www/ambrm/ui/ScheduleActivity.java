package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.util.CommonUtils;
import com.lz.www.ambrm.util.SPUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016-07-09.
 */
public class ScheduleActivity extends Activity {

    CalendarView calendarView;
    TimePicker timePicker;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        calendarView=(CalendarView)findViewById(R.id.cvSchedule);
        timePicker=(TimePicker)findViewById(R.id.tpSchedule);
        editText=(EditText)findViewById(R.id.etSchedule);


        Button btnSave=(Button)findViewById(R.id.btnAcSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long date = calendarView.getDate();
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();

                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd ");
                String nowDate = f.format(date);
                String scheduleTime = nowDate + hour + ":" + minute + ":00";

                String scheduleContent = editText.getText().toString();

                SPUtils.put(ScheduleActivity.this, "ScheduleTime", scheduleTime);
                SPUtils.put(ScheduleActivity.this, "ScheduleContent", scheduleContent);

                Toast.makeText(ScheduleActivity.this, scheduleTime, Toast.LENGTH_SHORT).show();
            }
        });

        Button btnCancel=(Button)findViewById(R.id.btnAcBack);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }


}
