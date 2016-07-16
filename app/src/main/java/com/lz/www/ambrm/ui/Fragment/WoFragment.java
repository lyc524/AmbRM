package com.lz.www.ambrm.ui.Fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lz.www.ambrm.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WoFragment extends Fragment {

   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_wo,container,false);
   }
}
