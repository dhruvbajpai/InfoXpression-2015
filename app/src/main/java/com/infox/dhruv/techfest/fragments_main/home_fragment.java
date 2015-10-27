package com.infox.dhruv.techfest.fragments_main;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.infox.dhruv.techfest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends android.app.Fragment {
    TextView desc;
    String about = new String("Infoxpression is the annual techno-cultural fest of University school of Information and " +
            "Communication Technology. It is the biggest technical extravaganza held at Indraprastha " +
            "University, which involves an active participation of students from over 250+ colleges of north " +
            "India attracting a footfall of about 5000+. " +
            "Infoxpression is an exhilarating voyage of technical know- how and promoting technology " +
            "and innovation. It would give you a chance to stop, culminate new ideas and to showcase " +
            "your technical expertise. Our endeavor would be to provide a space needed for the nurturing " +
            "of myriad ideas. It is a three day grandeur which involves a series of competitions, " +
            "workshops, guest lectures by some eminent personalities. " +
            "Guru Gobind Singh Indraprastha University was established in 1999 with the mission to strive " +
            "hard and provide a market oriented professional education to the student community of " +
            "India. To fulfill this aim and to bring students face to face with cutting edge technology, " +
            "Infoxpression is an amalgamation of creativity and imagination. It would be a perfect blend of " +
            "entertainment and technology with the aim of transformation and empowerment of the " +
            "society.");
    public home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_fragment, container, false);

       // desc.setText(about);

        return v;


    }


}
