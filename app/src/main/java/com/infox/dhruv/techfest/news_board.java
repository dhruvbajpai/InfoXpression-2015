package com.infox.dhruv.techfest;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
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

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


public class news_board extends ActionBarActivity {

    ListView listview;

    String[] values = new String[]{"abc","abc","abc"};
    private List<news> t_events ;
    List<ParseObject> ob;
    ProgressDialog mProgressDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConnectionDetector cd = new ConnectionDetector(getApplicationContext());

        Boolean isInternetPresent = cd.isConnectingToInternet();
        if(isInternetPresent) {
            setContentView(R.layout.activity_news_board);
            t_events = new ArrayList<news>();
            setTitle("News Board");
            new RemoteDataTask().execute();
        }else
            setContentView(R.layout.nonews);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);



       /* t_events.add(new news("INFOX","THIs is the fest"));
        t_events.add(new news("Results","Resulsts for the Coding Competition Codechef Codester are out"+"\n1. Dhruv Bajpai \n2.Aakriti Gupta"));
        t_events.add(new news("INFOX","THIs is the fest"));
        t_events.add(new news("Results","Resulsts for the Coding Competition Codechef Codester are out"+"\n1. Dhruv Bajpai \n2.Aakriti Gupta"));*/






    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    private class RemoteDataTask extends AsyncTask<Void, Void, Void> {


        protected void onPreExecute() {
            super.onPreExecute();
            // Create a progressdialog
            mProgressDialog = new ProgressDialog(news_board.this);
            // Set progressdialog title
            mProgressDialog.setTitle("Downloading Latest News");
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            // Locate the class table named "Country" in Parse.com

                ParseQuery<ParseObject> query = new ParseQuery<ParseObject>(
                        "News");
                query.orderByDescending("_created_at");
                try {
                    ob = query.find();
                } catch (ParseException e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
                return null;



        }

        @Override
        protected void onPostExecute(Void result) {
            // Locate the listview in listview_main.xml
            listview = (ListView) findViewById(R.id.news_list);
            // Pass the results into an ArrayAdapter
            final ArrayAdapter<news> adapter = new MyListAdapters(news_board.this,values);

            // Retrieve object "name" from Parse.com database
            for (ParseObject country : ob) {
                String h = country.getString("header");
                String info = country.getString("information");
                t_events.add(new news(h,info));
                country.pinInBackground();
                //adapter.add((String) country.get("name"));
            }
            // Binds the Adapter to the ListView
            ((ListView)findViewById(R.id.news_list)).setAdapter(adapter);
            //listview.setAdapter(adapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
            // Capture button clicks on ListView items





        }
    }
    public class ConnectionDetector {

        private Context _context;

        public ConnectionDetector(Context context){
            this._context = context;
        }

        public boolean isConnectingToInternet(){
            ConnectivityManager connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivity != null)
            {
                NetworkInfo[] info = connectivity.getAllNetworkInfo();
                if (info != null)
                    for (int i = 0; i < info.length; i++)
                        if (info[i].getState() == NetworkInfo.State.CONNECTED)
                        {
                            return true;
                        }

            }
            return false;
        }
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


    private class MyListAdapters extends ArrayAdapter<news> {
        //private final Context context;
        //private final String[] values;

        private final Context context;
        private final String[] values;

        public MyListAdapters(Context context, String[] values) {
            super(context, R.layout.news_item,t_events);
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

                itemView = getLayoutInflater().inflate(R.layout.news_item, parent, false);
                holder = new ViewHolder();
                holder.tv_head = (TextView)itemView.findViewById(R.id.header);
                holder.tv_info = (TextView)itemView.findViewById(R.id.infor);



                itemView.setTag(holder);
            }else {

                holder = (ViewHolder)itemView.getTag();
            }
            //Find the car to work with.

            final news currentnews = t_events.get(position);
            //Fill the View

            holder.tv_head.setText(currentnews.getHeader().toString());
            holder.tv_info.setText(currentnews.getInfo().toString());


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
        TextView tv_head;
        TextView tv_info;


    }

}
