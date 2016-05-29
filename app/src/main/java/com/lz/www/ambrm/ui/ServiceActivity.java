package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.Service.MyService;

/**
 * Created by Administrator on 2016/5/29.
 */
public class ServiceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_layout);
        Button btnStart=(Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(ServiceActivity.this, MyService.class);
                startService(it);
            }
        });
        Button btnStop=(Button)findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(ServiceActivity.this, MyService.class);
                stopService(it);

            }
        });


    }

}
