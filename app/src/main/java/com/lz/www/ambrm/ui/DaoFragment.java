package com.lz.www.ambrm.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.model.News;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016-06-01.
 */
public class DaoFragment extends Fragment implements AdapterView.OnItemClickListener {

    public List<News> mNewsList=null;
    public NewsAdapter mAdapter=null;
    public ListView lvNews;
    private TextView btnToList;


    public DaoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dao,container,false);

        mNewsList=new LinkedList<News>();
        mNewsList.add(new News(1,"B1","this is b1",R.drawable.b1));
        mNewsList.add(new News(2,"B2","this is b2",R.drawable.b2));
        mNewsList.add(new News(3,"B3","this is b3",R.drawable.b3));
        mNewsList.add(new News(4,"B4","this is b4",R.drawable.b4));

        mAdapter=new NewsAdapter((LinkedList<News>)mNewsList,getActivity());
        lvNews = (ListView) view.findViewById(R.id.lvDao);
        lvNews.setAdapter(mAdapter);
        lvNews.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getActivity(),"你点击了第" + i + "项",Toast.LENGTH_SHORT).show();

        Intent it=new Intent(getActivity(),NewsDetailActivity.class);
        startActivity(it);

    }
}
