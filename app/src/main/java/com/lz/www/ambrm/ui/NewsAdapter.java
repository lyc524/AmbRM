package com.lz.www.ambrm.ui;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.model.News;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016-05-30.
 */
public class NewsAdapter extends BaseAdapter {
    public ArrayList<News> mNewsList;
    private Context mContext;
    public NewsAdapter(ArrayList<News> newsList, Context context) {
        this.mNewsList=newsList;
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return mNewsList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view==null){
            view= LayoutInflater.from(mContext).inflate(R.layout.news_list_item,viewGroup,false);
            Log.d("adpater","create view");
            holder=new ViewHolder();
            holder.imgTP=(ImageView)view.findViewById(R.id.imgTP);
            holder.tvTitle=(TextView) view.findViewById(R.id.tvTitle);
            holder.tvContent=(TextView) view.findViewById(R.id.tvContent);
            Log.d("adpater","create img");
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }
        //holder.imgTP.setBackgroundResource();
        holder.tvTitle.setText(mNewsList.get(i).getTitle());
        holder.tvContent.setText(mNewsList.get(i).getContent());
        return view;
    }

    static class ViewHolder{
        ImageView imgTP;
        TextView tvTitle;
        TextView tvContent;
    }
}
