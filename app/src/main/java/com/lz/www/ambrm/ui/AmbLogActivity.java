package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.util.Config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-07-07.
 */
public class AmbLogActivity extends Activity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news);


        Cursor cursor=getContentResolver().query(Config.AMBLOG_URI,new String[]{"id as _id", "Source","Content"},null,null,null);

        listView=(ListView) findViewById(R.id.lvDao);
        SimpleCursorAdapter adapter=new SimpleCursorAdapter(this,R.layout.news_list_item,cursor,new String[]{"Source","Content"},new int[]{R.id.tvTitle,R.id.tvContent},0);
        listView.setAdapter(adapter);

    }






}
