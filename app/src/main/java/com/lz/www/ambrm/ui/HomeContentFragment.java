package com.lz.www.ambrm.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-05-25.
 */
public class HomeContentFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_content_fragment,container,false);
        return view;
    }
}