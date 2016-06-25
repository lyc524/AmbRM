package com.lz.www.ambrm.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.lz.www.ambrm.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-06-24.
 */
public class ShuFragment extends Fragment {
    private GridView gridView;
    private SimpleAdapter mAdapter=null;
    private List<Map<String, Object>> data_list;
    // 图片封装为一个数组
    private int[] icon = { R.drawable.b1, R.drawable.b2,
            R.drawable.b3, R.drawable.b4, R.drawable.b1,
            R.drawable.b2, R.drawable.b3, R.drawable.b4,
            R.drawable.b1, R.drawable.b2, R.drawable.b3,
            R.drawable.b4 };
    private String[] iconName = { "通讯录", "日历", "照相机", "时钟", "游戏", "短信", "铃声",
            "设置", "语音", "天气", "浏览器", "视频" };



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_shu,container,false);
        gridView=(GridView) view.findViewById(R.id.gvShu);

        //新建List
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String [] from ={"image","text"};
        int [] to = {R.id.ivGvShu,R.id.tvGvShu};
        mAdapter = new SimpleAdapter(getActivity(), data_list, R.layout.item_gv_shu, from, to);
        //配置适配器
        gridView.setAdapter(mAdapter);


        return view;
    }

    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }

        return data_list;
    }


}
