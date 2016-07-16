package com.lz.www.ambrm.ui.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-05-25.
 */
public class HomeContentFragment extends Fragment {

    public HomeContentFragment()
    {
    }

    private  String _content;
    public HomeContentFragment(String _content) {
        this._content = _content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_content_fragment,container,false);
        TextView tvContent=(TextView)view.findViewById(R.id.tvHomeFgText);
        tvContent.setText(_content);
        return view;
    }
}
