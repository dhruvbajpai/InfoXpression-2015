package com.infox.dhruv.techfest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.infox.dhruv.techfest.fragments_main.home_fragment;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener //implements View.OnClickListener
 {

    Button b1;
    ParseObject myobject = new ParseObject("Entries");
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private String[] comp_list;
     private MyAdapter myadapter;
    private ActionBarDrawerToggle drawerListener;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("InfoXpression");


        setContentView(R.layout.activity_main);
        //mDrawerLayout.openDrawer(R.id.left_drawer);


        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.content_frame,new home_fragment());
        transaction.commit();


       ParseAnalytics.trackAppOpened(getIntent());
        /*ParseUser user = new ParseUser();
        user.setUsername("Rahul");
        user.setPassword("mypass");
        user.setEmail("dbcooslsdster@example.com");


// other fields can be set just like with ParseObject
        user.put("phone", "650-253-0000");

        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(MainActivity.this,"Registered",Toast.LENGTH_SHORT).show();
                    // Hooray! Let them use the app now.

                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });*/
        ///DRAWER LAYOUT CODE/////
        comp_list = getResources().getStringArray(R.array.competition_list);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerList = (ListView)findViewById(R.id.left_drawer);
        myadapter = new MyAdapter(this);
        mDrawerList.setAdapter(myadapter);

        /*mDrawerList.setAdapter(new ArrayAdapter<String>(this,
               android.R.layout.simple_list_item_1, comp_list));*/
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = null;
                switch (position){

                    case 0:
                        i = new Intent(MainActivity.this,Event_Page_Re.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;
                    case 1:
                /* FragmentManager manager = getFragmentManager();
                 FragmentTransaction transaction = manager.beginTransaction();*/
                // transaction.replace(R.id.content_frame,new home_fragment());*/
                        //getFragmentManager().beginTransaction().replace(R.id.content_frame,new about_usict()).commit();
                        i = new Intent(MainActivity.this, aboutusit.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }

                        //transaction.commit();
                        break;
                    case 2:
                        i = new Intent(MainActivity.this,aboutinfox.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        i = new Intent(MainActivity.this,MapsActivity.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        i = new Intent(MainActivity.this,sponsors.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        i = new Intent(MainActivity.this,Registeration_Form.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        i = new Intent(MainActivity.this,contactus.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;

                    case 7:
                        i = new Intent(MainActivity.this,news_board.class);
                        try{
                            startActivity(i);}
                        catch (Error e){
                            e.printStackTrace();
                        }
                        break;

                    case 8:
                        dev_dialog d = new dev_dialog();
                        d.show(getFragmentManager(),"Dev");
                        break;

                }


            }
        });
        drawerListener = new ActionBarDrawerToggle(this,mDrawerLayout,
                R.drawable.my_icon,R.string.drawer_open,
                R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                //Toast.makeText(MainActivity.this,"Drawer Opened",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                setTitle("InfoXpression");
                //Toast.makeText(MainActivity.this,"Drawer Closed",Toast.LENGTH_SHORT).show();
            }
        };
        mDrawerLayout.setDrawerListener(drawerListener);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ///DRAWER LAYOUT CODE/////
        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "happy");
        //testObject.saveInBackground();
        /*b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);*/
    }

     @Override
     protected void onPostCreate(Bundle savedInstanceState) {
         super.onPostCreate(savedInstanceState);
         drawerListener.syncState();
     }

     @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

     @Override
     public void onConfigurationChanged(Configuration newConfig) {
         super.onConfigurationChanged(newConfig);
         drawerListener.onConfigurationChanged(newConfig);
     }

     @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(drawerListener.onOptionsItemSelected(item)){
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

     @Override
     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         //Toast.makeText(this,comp_list[position]+ "at "+ position+" was selected",Toast.LENGTH_SHORT).show();
          /*  Intent i = null;
         switch (position){

             case 0:
                 i = new Intent(MainActivity.this,Event_Page_Re.class);
                 break;
             case 1:
                *//* FragmentManager manager = getFragmentManager();
                 FragmentTransaction transaction = manager.beginTransaction();
                 transaction.replace(R.id.content_frame,new home_fragment());*//*
                 //getFragmentManager().beginTransaction().replace(R.id.content_frame,new FragmentA()).commit();
                 //transaction.commit();
                 break;
             case 2:
                 i = new Intent(MainActivity.this,Registeration_Form.class);
                 break;
             case 3:
                 i = new Intent(MainActivity.this,MapsActivity.class);
                 break;
             case 4:
                 i = new Intent(MainActivity.this,Registeration_Form.class);
                 break;
             case 6:
                 i = new Intent(MainActivity.this,Registeration_Form.class);
                 break;
             case 7:
                 i = new Intent(MainActivity.this,Registeration_Form.class);
                 break;

         }
         try{
         startActivity(i);}
         catch (Error e){
             e.printStackTrace();
         }*/


         /////////////////////////ITEM CLICK LISTENER///////////////////////////////
        /* if (position==0)
         {
             Intent i = new Intent(MainActivity.this,Events_page.class);
             startActivity(i);
         }*/
         /*else if(position==3)

         {
             Intent i = new Intent(MainActivity.this,Location.class);
             startActivity(i);

         }
         else {
             Intent i = new Intent(MainActivity.this, Registeration_Form.class);
             startActivity(i);
         }
         Intent i = new Intent(MainActivity.this,Location.class);
         startActivity(i);*/

         selectItem(position);
     }

     public void selectItem(int position) {
         mDrawerList.setItemChecked(position,true);
         setTitle(comp_list[position]);

     }
     public void setTitle(String title)
     {
         getSupportActionBar().setTitle(title);//takes a string argument and sets the title of the action bar to that

     }




   /* public void onClick(View v) {
        Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show();

        myobject.put("new Column", "killers");
        try {
            myobject.save();        ////THIS IS NOT WORKING>......
        } catch (ParseException e) {
            Log.d("DHRUV","IS IT OR NOT");
            e.printStackTrace();
        }
       *//* Intent i = new Intent(this,Registeration_Form.class);
        startActivity(i);*//*
    }*/
}
class MyAdapter extends BaseAdapter{

    String[] comp_list;
    Integer[] image_list = new Integer[]{};
    private Context context;
    //int[] images = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5,R.drawable.car6,R.drawable.car1};
    MyAdapter(Context context){
        this.context = context;
        comp_list = context.getResources().getStringArray(R.array.competition_list);
    }
    @Override
    public int getCount() {
        return comp_list.length;
    }

    @Override
    public Object getItem(int position) {
        return comp_list[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = null;
        if(convertView==null)//Creating this for the first time
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_row,parent,false);
        }
        else
        {
            row = convertView;
        }
        TextView titleTextView = (TextView)row.findViewById(R.id.txt1);
        ImageView titleImageView = (ImageView)row.findViewById(R.id.img1);
        titleImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        switch(position){
            case 0:
                titleImageView.setImageResource(R.drawable.iconlist);
                break;

            case 1:
                titleImageView.setImageResource(R.drawable.about_usict);
                break;

            case 2:
                titleImageView.setImageResource(R.drawable.infox_actualpng);
                break;

            case 3:
                titleImageView.setImageResource(R.drawable.mapicon);
                break;
            case 4:
                titleImageView.setImageResource(R.drawable.icon_sponsorship);
                break;

            case 5:
                titleImageView.setImageResource(R.drawable.register);
                break;
            case 6:
                titleImageView.setImageResource(R.drawable.cntc);
                break;
            case 7:
                titleImageView.setImageResource(R.drawable.nnews);
                break;
            case 8:
                titleImageView.setImageResource(R.drawable.android);
                break;


        }
        titleTextView.setText(comp_list[position]);

        return row;
    }



}

