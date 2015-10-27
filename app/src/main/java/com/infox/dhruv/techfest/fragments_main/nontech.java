package com.infox.dhruv.techfest.fragments_main;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infox.dhruv.techfest.Event_DESC_final;
import com.infox.dhruv.techfest.R;
import com.infox.dhruv.techfest.Registeration_Form;

/**
 * A simple {@link Fragment} subclass.
 */
public class nontech extends android.support.v4.app.Fragment implements View.OnClickListener {

    View v;
    View[] events = new View[6];
    public nontech() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_nontech, container, false);
        events[0] = v.findViewById(R.id.n_one);
        events[1] = v.findViewById(R.id.n_two);
        events[2] = v.findViewById(R.id.n_three);
        events[3] = v.findViewById(R.id.n_four);
        events[4] = v.findViewById(R.id.n_five);
        events[5] = v.findViewById(R.id.n_six);

        events[0].setOnClickListener(this);
        events[1].setOnClickListener(this);
        events[2].setOnClickListener(this);
        events[3].setOnClickListener(this);
        events[4].setOnClickListener(this);
        events[5].setOnClickListener(this);



        return v;

    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
        switch (v.getId()) {
            case R.id.n_one:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                /*i.putExtra("pane",pane);
                i.putExtra("pos",0);*/
                i.putExtra("pos", 11);
                break;
            case R.id.n_two:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos", 12);
                break;
            case R.id.n_three:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos", 13);
                break;
            case R.id.n_four:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos", 14);
                break;
            case R.id.n_five:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos", 15);
                break;
            case R.id.n_six:
                i = new Intent(getActivity().getBaseContext(), Event_DESC_final.class);
                i.putExtra("pos", 16);
                break;


        }
        Intent u = new Intent(getActivity().getBaseContext(), Registeration_Form.class);
        //Toast.makeText(getActivity().getBaseContext(),"HELLLO WORLD",Toast.LENGTH_SHORT).show();
        try {
            startActivity(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
