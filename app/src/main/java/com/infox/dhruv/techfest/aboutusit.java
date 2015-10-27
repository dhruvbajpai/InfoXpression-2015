package com.infox.dhruv.techfest;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class aboutusit extends ActionBarActivity {

    ImageView iv,lv;
    TextView tv;
    AnimationDrawable frameanimation;
    Integer[] images = new Integer[]{R.drawable.backgear,R.drawable.circuitrix,R.drawable.robohustle};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutusit);
        getSupportActionBar().hide();
        iv = (ImageView)findViewById(R.id.imageview);

        lv= (ImageView)findViewById(R.id.loopview);
        lv.setScaleType(ImageView.ScaleType.FIT_XY);
        lv.setBackgroundResource(R.drawable.animation_lis);


        iv.setImageResource(R.drawable.about);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);


        tv = (TextView)findViewById(R.id.tv);
        tv.setText("The University School of Information & Communication Technology has been established to " +
                "design and implement courses with a twin objective of generating effective professionals and " +
                "to keep pace with the R&D activities of this fast emerging and changing field of Information & " +
                "Communication Technology. The school aims at inculcating essential skills as demanded by " +
                "the global software industry, through the interactive learning process. This includes " +
                "team-building skills, audio-visual presentations and personality development programmes. " +
                "These enhance analytic and communication skills, besides inculcating the virtues of " +
                "self-study. " +
                "The School was set up with an aspiration to generate manpower, with the ability to take on " +
                "challenges and fare forward in the realm of Information & Communication Technology. The " +
                "Curriculum has been designed to cater to the ever changing demands of information & " +
                "communication technology, with the necessary inputs from the Industry. The School has " +
                "highly qualified & experienced faculty who excel in their respective areas. It also encourages " +
                "research work in various areas of information & communication technology. It aspires to " +
                "produce individuals equipped to contribute for progress at all levels: individual, national and " +
                "global.");

        frameanimation = (AnimationDrawable)lv.getBackground();
        /*AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.geekwars), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.robohustle), 500);
        animation.addFrame(getResources().getDrawable(R.drawable.roborace), 300);
        animation.setOneShot(false);


        iv.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();
        //startAnimation();
*/


    }



    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // Starting the animation when in Focus
            frameanimation.start();
        } else {
            // Stoping the animation when not in Focus
            frameanimation.stop();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aboutusit, menu);
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

    /*class Starter implements Runnable {
        public void run() {
            animation.start();
        }
    }

    private void startAnimation(){
        animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.circuitrix), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.robohustle), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.geekwars), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.fest), 100);

        animation.setOneShot(true);

        ImageView imageView = (ImageView)findViewById(R.id.imageview);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 90);
        params.alignWithParent = true;
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        imageView.setLayoutParams(params);
        imageView.setImageDrawable(animation);
        imageView.post(new Starter());
    }*/

}
