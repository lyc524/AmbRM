package com.lz.www.ambrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lz.www.ambrm.model.HttpResponse;
import com.lz.www.ambrm.net.HttpService;
import com.lz.www.ambrm.ui.HomeActivity;
import com.lz.www.ambrm.util.Config;
import com.lz.www.ambrm.util.JsonUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                String api= Config.UserAPI + "getlist";
                HttpService.doGetAsyn(api,new MyCallBack());

            }
        });
    }

    class MyCallBack implements HttpService.HttpCallBack{
        @Override
        public void onRequestComplete(String result) {

            HttpResponse r = JsonUtils.parseJson(result);
//            if(r!=null){
//                Log.d("result:",r.getMsg());
//            }
//            Log.d("result:",result);
            Toast.makeText(MainActivity.this,r.getMsg(),Toast.LENGTH_SHORT).show();
        }
    }
}
