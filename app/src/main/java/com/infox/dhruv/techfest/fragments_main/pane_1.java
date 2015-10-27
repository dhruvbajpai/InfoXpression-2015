package com.infox.dhruv.techfest.fragments_main;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infox.dhruv.techfest.Event_DESC_final;
import com.infox.dhruv.techfest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pane_1 extends android.support.v4.app.Fragment implements View.OnClickListener {

    View v;
    View[] events = new View[7];

    public pane_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_pane_1, container, false);
        events[0] = v.findViewById(R.id.c_one);
        events[1] = v.findViewById(R.id.c_two);
        events[2] = v.findViewById(R.id.c_three);
        events[3] = v.findViewById(R.id.c_four);
        events[4] = v.findViewById(R.id.c_five);
        events[5] = v.findViewById(R.id.c_six);
        events[6] = v.findViewById(R.id.c_webbee);
        events[0].setOnClickListener(this);
        events[1].setOnClickListener(this);
        events[2].setOnClickListener(this);
        events[3].setOnClickListener(this);
        events[4].setOnClickListener(this);
        events[5].setOnClickListener(this);
        events[6].setOnClickListener(this);


        return v;
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity().getBaseContext(),Event_DESC_final.class);
        switch (v.getId())
        {
            case R.id.c_one:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                /*i.putExtra("pane",pane);
                i.putExtra("pos",0);*/
                i.putExtra("pos",0);
                break;
            case R.id.c_two:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",1);
                break;
            case R.id.c_three:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",2);
                break;
            case R.id.c_four:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",3);
                break;
            case R.id.c_five:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",4);
                break;
            case R.id.c_six:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",5);
                break;
            case R.id.c_webbee:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",6);
                break;

        }

        startActivity(i);
    }

}
