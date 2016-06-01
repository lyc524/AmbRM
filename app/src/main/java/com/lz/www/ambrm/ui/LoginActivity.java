package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.net.HttpService;
import com.lz.www.ambrm.util.Config;

/**
 * Created by Administrator on 2016-05-24.
 */
public class LoginActivity extends Activity {

    //step1:主线程定义处理方法
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {



            if(msg.obj.toString().equals("1")){
               // Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                Intent it = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(it);
            }else {
                //Toast.makeText(LoginActivity.this,"登录失败",Toast.LENGTH_SHORT);
                AlertDialog.Builder dialog=new AlertDialog.Builder(LoginActivity.this);
                dialog.setTitle("登录失败,用户名或者密码不正确");
                dialog.setMessage("status:"+msg.obj.toString());
                dialog.show();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent it = new Intent(LoginActivity.this, HomeActivity.class);
//                startActivity(it);

                EditText tvName=(EditText) findViewById(R.id.etUserName);
                EditText tvPwd=(EditText) findViewById(R.id.etPassword);

                String name= tvName.getText().toString();
                String pwd=tvPwd.getText().toString();

                final String url= Config.AMB_API+"act=login&name="+name+"&pwd="+pwd;

                //step2:子线程定义运行方法
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                       String re = HttpService.sendGetRequest(url);
                        Message msg=new Message();
                        msg.obj=re;
                        handler.sendMessage(msg);
                    }
                }).start();
            }
        });

        Button btnRegister=(Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(it);
            }
        });
    }





}
