package com.infox.dhruv.techfest;


import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends ListFragment {

    //TextView tv ;
    //ListView lv;
    String[] values = new String[]{"Message1", "Message2", "Message3"};
    //String[] list = {"Competition 1","Competition 2"};
    private List<Event> t_events = new ArrayList<Event>();

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //tv = (TextView)getView().findViewById(R.id.textView);
        //lv = (ListView)getActivity().findViewById(R.id.listView);
        //lv.setAdapter(new ArrayAdapter<String>(this,
        //      android.R.layout.simple_list_item_1, list);
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);

        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        // android.R.layout.simple_list_item_1, values);

        populateEventList();
        final ArrayAdapter<Event> adapter = new MyListAdapter(getActivity().getBaseContext(), values);

        setListAdapter(adapter);
        //populateListView();

        //setListAdapter(adapter);

        return rootView;

    }

    public void populateEventList() {

        /*t_events.add(new Event("JAVA JIG", R.drawable.ic_action_back, "JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s\n" +
                "contributions have been innumerable. Called the most robust programming language, the\n" +
                "JAVA JIG tests your proficiency in this language. It will test how well you know the nuances\n" +
                "of JAVA as well as your skills as a coder.", "t"));
        t_events.add(new Event("HackerRank", R.drawable.ic_action_back, "This is a website event", "t"));
        t_events.add(new Event("Youtube", R.drawable.ic_action_back, "This is a modelling event", "t"));
        t_events.add(new Event("google", R.drawable.ic_action_back, "This is a programming event", "t"));
        t_events.add(new Event("google", R.drawable.ic_action_back, "This is a programming event", "t"));
        t_events.add(new Event("google", R.drawable.ic_action_back, "This is a programming event", "t"));
        t_events.add(new Event("google", R.drawable.ic_action_back, "This is a programming event", "t"));*/
    }

    public void populateListView() {
        //We're going to use an arrayadapter...An arrayadapter for Car class


    }

    private class MyListAdapter extends ArrayAdapter<Event> {
        private final Context context;
        private final String[] values;

        public MyListAdapter(Context context, String[] values) {
            super(context, R.layout.item_views_list, t_events);
            this.values = values;
            this.context = context;
        }
        //getView function is going to be implemented/overridden here..
        //Alt+Shift+S

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with(may have been given null)
            View itemView = convertView;
            if (itemView == null)
                itemView = getActivity().getLayoutInflater().inflate(R.layout.item_views_list, parent, false);

            //Find the car to work with.
            final Event currentevent = t_events.get(position);
            //Fill the View
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imgview);
            imageView.setImageResource(currentevent.getImage_id());
            imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Toast.makeText(getActivity(), "Event of " + currentevent.getEvent_name() + " Clicked", Toast.LENGTH_SHORT).show();

                }
            });
            //Make
            TextView event_name_Text = (TextView) itemView.findViewById(R.id.evntname);
            event_name_Text.setText(currentevent.getEvent_name());

            //Year
            TextView event_dedc_Text = (TextView) itemView.findViewById(R.id.evntdesc);
            event_dedc_Text.setText(currentevent.getEvent_desc());

            /*//Condition
            TextView conditionText = (TextView)itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());*/

            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }
}
