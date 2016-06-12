package com.lz.www.ambrm.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-06-04.
 */
public class FaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fa,container,false);
        return view;
    }
}
