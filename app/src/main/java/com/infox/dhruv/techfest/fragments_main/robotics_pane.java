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
public class robotics_pane extends android.support.v4.app.Fragment implements View.OnClickListener {

    View vr;
    int pane =2;
    View[] r_event=  new View[4];
    public robotics_pane() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vr = inflater.inflate(R.layout.fragment_robotics_pane, container, false);
        r_event[0] = vr.findViewById(R.id.robot_one);
        r_event[1] = vr.findViewById(R.id.robot_two);
        r_event[2] = vr.findViewById(R.id.robot_three);
        r_event[3] = vr.findViewById(R.id.robot_four);
        r_event[0].setOnClickListener(this);
        r_event[1].setOnClickListener(this);
        r_event[2].setOnClickListener(this);
        r_event[3].setOnClickListener(this);

        return vr;
    }


    public void onClick(View v) {
        Intent i = new Intent(getActivity().getBaseContext(),Event_DESC_final.class);
        switch (v.getId())
        {
            case R.id.robot_one:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                /*i.putExtra("pane",pane);
                i.putExtra("pos",0);*/
                i.putExtra("pos",7);
                break;
            case R.id.robot_two:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",8);
                break;
            case R.id.robot_three:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",9);
                break;
            case R.id.robot_four:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos",10);
                break;

        }

        startActivity(i);
    }

}
