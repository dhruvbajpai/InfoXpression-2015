package com.infox.dhruv.techfest.fragments_main;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infox.dhruv.techfest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class online_pane extends android.support.v4.app.Fragment {


    public online_pane() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        try {
            return inflater.inflate(R.layout.fragment_online_pane, container, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inflater.inflate(R.layout.fragment_online_pane, container, false);
    }
}



