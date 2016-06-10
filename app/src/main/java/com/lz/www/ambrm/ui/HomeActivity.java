package com.lz.www.ambrm.ui;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.lz.www.ambrm.R;

/**
 * Created by Administrator on 2016-05-25.
 */
public class HomeActivity extends Activity implements RadioGroup.OnCheckedChangeListener{

    private DaoFragment fg1;
    private HomeContentFragment fg2,fg3,fg4;
    private FragmentManager fm;

//    private TextView _tvHomeTop;
//    private TextView _tvDao;
//    private TextView _tvFa;
//    private TextView _tvShu;
//    private TextView _tvQi;
//    private FrameLayout _homeContent;

    private RadioGroup _homeTabBar;
    private RadioButton _itemDao;


    private void hideAllFragment(FragmentTransaction ft){
        if(fg1!=null)ft.hide(fg1);
        if(fg2!=null)ft.hide(fg2);
        if(fg3!=null)ft.hide(fg3);
        if(fg4!=null)ft.hide(fg4);
    }

//    private void setTextNoSelected(){
//        _tvDao.setSelected(false);
//        _tvFa.setSelected(false);
//        _tvShu.setSelected(false);
//        _tvQi.setSelected(false);
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        fm=getFragmentManager();
        _homeTabBar=(RadioGroup)findViewById(R.id.homeTabBar);
        _homeTabBar.setOnCheckedChangeListener(this);
        _itemDao=(RadioButton)findViewById(R.id.itemDAO);
        _itemDao.setChecked(true);
        // bindViews();
        //_tvDao.performClick();
    }

//    private void bindViews() {
//        _tvHomeTop = (TextView) findViewById(R.id.tvHomeTop);
//        _tvDao = (TextView) findViewById(R.id.tvDao);
//        _tvFa = (TextView) findViewById(R.id.tvFa);
//        _tvShu = (TextView) findViewById(R.id.tvShu);
//        _tvQi = (TextView) findViewById(R.id.tvQi);
//
//        _tvDao.setOnClickListener(this);
//        _tvFa.setOnClickListener(this);
//        _tvShu.setOnClickListener(this);
//        _tvQi.setOnClickListener(this);
//
//    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction ft=fm.beginTransaction();
        hideAllFragment(ft);
        switch (checkedId){
            case R.id.itemDAO:
                //setTextNoSelected();
                //_tvDao.setSelected(true);
                if(fg1 == null){
                    fg1 = new DaoFragment();
                    ft.add(R.id.homeContent,fg1);
                }else{
                    ft.show(fg1);
                }
                break;
            case R.id.itemFA:
                if(fg2 == null){
                    fg2 = new HomeContentFragment(getString(R.string.fa));
                    ft.add(R.id.homeContent,fg2);
                }else{
                    ft.show(fg2);
                }
                break;
            case R.id.itemSHU:
                if(fg3 == null){
                    fg3 = new HomeContentFragment(getString(R.string.shu));
                    ft.add(R.id.homeContent,fg3);
                }else{
                    ft.show(fg3);
                }
                break;
            case R.id.itemQI:
                if(fg4 == null){
                    fg4 = new HomeContentFragment(getString(R.string.qi));
                    ft.add(R.id.homeContent,fg4);
                }else{
                    ft.show(fg4);
                }
                break;
        }
        ft.commit();
    }
}
