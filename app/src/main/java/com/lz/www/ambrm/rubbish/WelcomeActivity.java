package com.lz.www.ambrm.rubbish;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.lz.www.ambrm.R;
import com.lz.www.ambrm.rubbish.FaFragment_ViewPager;

/**
 * Created by Administrator on 2016-06-23.
 */
public class WelcomeActivity extends FragmentActivity {

    private FragmentManager fm;
    private FaFragment_ViewPager faFragment;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        fm=getSupportFragmentManager();
        faFragment=new FaFragment_ViewPager();
        fm.beginTransaction().add(R.id.welcomeContent,faFragment).commit();
    }
}
