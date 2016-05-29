package com.lz.www.ambrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lz.www.ambrm.ui.LoginActivity;
import com.lz.www.ambrm.ui.NewsDetailActivity;
import com.lz.www.ambrm.ui.ServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenLogin=(Button)findViewById(R.id.btnOpenLogin);
        btnOpenLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(it);
            }
        });
    }
}
