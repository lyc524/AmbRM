package com.lz.www.ambrm.rubbish;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-06-22.
 */
public class FaFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList = new ArrayList<Fragment>();  ;

    public FaFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList.add(new SbuFragment_VP());
        fragmentList.add(new ReportFragment_VP());
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
       return fragmentList.get(position);
    }

}
