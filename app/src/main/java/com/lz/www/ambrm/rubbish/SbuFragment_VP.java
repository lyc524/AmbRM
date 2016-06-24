package com.lz.www.ambrm.rubbish;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-06-22.
 */
public class SbuFragment_VP extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fa_sbu,container,false);
        return  view;
    }
}
