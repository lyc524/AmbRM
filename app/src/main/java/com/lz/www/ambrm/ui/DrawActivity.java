package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016-07-15.
 */
public class DrawActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
}
