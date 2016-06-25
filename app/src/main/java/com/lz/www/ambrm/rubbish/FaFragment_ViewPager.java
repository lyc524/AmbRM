package com.lz.www.ambrm.rubbish;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-06-04.
 */
public class FaFragment_ViewPager extends Fragment implements RadioGroup.OnCheckedChangeListener,ViewPager.OnPageChangeListener {

    private Context mContext;
    private RadioGroup faTopTab;
    private RadioButton rbTabSbu;
    private RadioButton rbTabReport;
    private ViewPager vpFa;

    private FaFragmentPagerAdapter faAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fa,container,false);

        faAdapter=new FaFragmentPagerAdapter(getFragmentManager());
        bindView(view);
        return view;
    }

    private void bindView(View view){
        faTopTab=(RadioGroup)view.findViewById(R.id.faTopTab);
        rbTabSbu=(RadioButton)view.findViewById(R.id.tabSub);
        rbTabReport=(RadioButton)view.findViewById(R.id.tabReport);
        faTopTab.setOnCheckedChangeListener(this);

        //vpFa=(ViewPager)view.findViewById(R.id.vpFa);
        vpFa.setAdapter(faAdapter);
        vpFa.setCurrentItem(0);
        vpFa.addOnPageChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.tabReport:
                vpFa.setCurrentItem(PAGE_ONE);
                break;
            case R.id.tabSub:
                vpFa.setCurrentItem(PAGE_TWO);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if(state==2){
            switch (vpFa.getCurrentItem()){
                case PAGE_ONE:
                    rbTabReport.setChecked(true);
                    break;
                case PAGE_TWO:
                    rbTabSbu.setChecked(true);
                    break;
            }

        }
    }
}
