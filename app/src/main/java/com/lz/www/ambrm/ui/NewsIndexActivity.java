package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.model.News;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016-05-30.
 */
public class NewsIndexActivity extends Activity implements AdapterView.OnItemClickListener {

    private List<News> mNewsList=null;
    private Context mContext;
    private NewsAdapter mAdapter=null;
    private ListView lvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news);

        mContext=NewsIndexActivity.this;
        lvNews=(ListView)findViewById(R.id.lvDao);
        mNewsList=new LinkedList<News>();
        mNewsList.add(new News(1,"B1","b1",R.drawable.b1));
        mNewsList.add(new News(2,"B2","b2",R.drawable.b2));
        mNewsList.add(new News(3,"B3","b3",R.drawable.b3));
        mNewsList.add(new News(4,"B4","b4",R.drawable.b4));

        mAdapter=new NewsAdapter((LinkedList<News>)mNewsList,mContext);
        lvNews.setAdapter(mAdapter);
        lvNews.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       Toast.makeText(mContext,"你点击了第" + i + "项",Toast.LENGTH_SHORT).show();
    }
}
