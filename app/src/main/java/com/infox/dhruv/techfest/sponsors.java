package com.infox.dhruv.techfest;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class sponsors extends ActionBarActivity {
    String[] values = new String[]{"abc","abc","abc"};
    private List<SP_images> t_events ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        t_events = new ArrayList<SP_images>();
        t_events.add(new SP_images(R.drawable.xinoe));
        t_events.add(new SP_images(R.drawable.story));
        t_events.add(new SP_images(R.drawable.codester));
        t_events.add(new SP_images(R.drawable.youth_incorporated));
        t_events.add(new SP_images(R.drawable.ams));
        t_events.add(new SP_images(R.drawable.gatecoach));
        t_events.add(new SP_images(R.drawable.ims));
        setTitle("Our Sponsors");

        final ArrayAdapter<SP_images> adapter = new MyListAdapter(this,values);
        ((ListView)findViewById(R.id.sp_list)).setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sponsors, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private class MyListAdapter extends ArrayAdapter<SP_images> {
        //private final Context context;
        //private final String[] values;

        private final Context context;
        private final String[] values;

        public MyListAdapter(Context context, String[] values) {
            super(context, R.layout.sponsors, t_events);
            this.values = values;
            this.context = context;
        }
        //getView function is going to be implemented/overridden here..
        //Alt+Shift+S
        private int lastPosition = -1;




        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with(may have been given null)

            final ViewHolder holder;
            View itemView = convertView;
            if (itemView == null) {

                itemView = getLayoutInflater().inflate(R.layout.sponsors, parent, false);
                holder = new ViewHolder();

                holder.imageView = (ImageView) itemView.findViewById(R.id.sp_imageview);

                itemView.setTag(holder);
            }else {

                holder = (ViewHolder)itemView.getTag();
            }
            //Find the car to work with.

            final SP_images currentimage = t_events.get(position);
            //Fill the View

            holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.imageView.setImageResource(currentimage.getImage_id());

            /*//Condition
            TextView conditionText = (TextView)itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());*/
            Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
            itemView.startAnimation(animation);
            lastPosition = position;
            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }
    static class ViewHolder{
        ImageView imageView;


    }

}
