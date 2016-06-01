package com.lz.www.ambrm.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-06-01.
 */
public class DaoFragment extends Fragment {
    public DaoFragment() {
    }

    private  String _content;
    public DaoFragment(String _content) {
        this._content = _content;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dao,container,false);
        return view;
    }
}
