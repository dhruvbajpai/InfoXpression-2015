package com.infox.dhruv.techfest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class Event_DESC_final extends Activity {

    Integer position=0,pane=0,final_position=0;
    SubActionButton button1,button2,button3;

    String[] dates = new String[]{"14th March","13th March","15th March","15th March","13th March","13th March","14th March","14th March","13th March","15th March","14th March","13th March","15th March","14th March","15th March","15th March","13th March","Running","Running","Running","Running"};
    String[] times = new String[]{"13:00","12:00","11:00","14:00","15:00","16:00","11:00","15:00","13:00","11:00","13:00","12:00","11:00","15:00","13:00","15:00","14:00","Running","Running","Running","Running"};
    String[] venues = new String[]{"E-313(DBMS Lab)","E-503","E-312","E-318","E-313(DBMS Lab)","E-312(DBMS Lab)","E-318","D-Block Parking","E-Block Parking","E-Block Parking","E-212,E-413(VLSI Lab)","D-318","","E-Block Seminar Hall","E-Block Seminar Hall","","","Online","Online","Online","Online"};
    Integer[] images = new Integer[]{R.drawable.algoholics,R.drawable.codester,R.drawable.javajig,R.drawable.linux,R.drawable.backgear,R.drawable.datacrunch,R.drawable.weebee,R.drawable.roborace,
            R.drawable.mind_the_line,R.drawable.robohustle,R.drawable.circuitrix,R.drawable.col,R.drawable.crusade,R.drawable.geekwars,R.drawable.green,R.drawable.know_all,R.drawable.rubix,R.drawable.almightee,R.drawable.bootstrapp,R.drawable.rooters,R.drawable.xcelens,};
    String[] event_name = new String[]{"ALGOHOLICS","CODESHEF CODESTER","JAVA JIG","LINUX NINJA","BACK GEAR","DATA CRUNCHERS","WEB-BEE","ROBO-RACE","MIND THE LINE","ROBO-HUSTLE","CIRCUITRIX","CLASH-ON-LAN","CRUSADE","GEEK WARS","GREENOVATION","KNOW-IT-ALL","RUBIX","AlMIGHTee","BOOTSTRAPP","ROOTERS","XCEL-LENS"};
    String[] event_desc = new String[]{"We are obsessed with solutions to all our problems. But we know that a problem may have " +
            "any number of solutions. To find out the least complex path to our solutions we bring you " +
            "algoholics. Write the best pseudo code and prove your mettle.","Codechef Codester Event for The Programmers under the Umbrella of Codechef. The event includes multiple algorithm based problems that have to be solved under a limited time frame of 4 hours. The team to submit the maximum no. of correct solutions will be declared as the winners. There is no negative marking so a team can make any no. of submissions . Code in any programming language. Due to large no. of registrations received very few slots are left. Register and win lots of prizes. Last day of registration 13th March 2015 before 00:00 .The students participating in the competition will be short listed through a flash quiz round. Limited No of seats .HURRY! Great Prizes and certificates to be won! \" +\n" +
            "            \"Date: 13th February \" + " +
            "            \"Venue: GGSIPU Dwarka Sec-16C E-block  " +
            "            \"Time: 12 Noon to 8 Pm","JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s " +
            "contributions have been innumerable. Called the most robust programming language, the " +
            "JAVA JIG tests your proficiency in this language. It will test how well you know the nuances " +
            "of JAVA as well as your skills as a coder.","Linux was a work of genius. An operating system that was free. Not only that, you could " +
            "contribute in making it better. This gave birth to a community formed of programmers with " +
            "great skill. To salute this phenomena of open source technology, we bring to you the LINUX " +
            "COMMAND NINJA. Show the world how well you know the linux command line and how can " +
            "you contribute to this dynamic technology.","This contest will challenge the conventional norms of programming where in a programmer " +
            "generates output from the code. Here, we present the competitors with the output and the " +
            "programmers are required to apply their reverse engineering skills to generate the code that " +
            "gives this output.","Database management Is an indispensable part of current scenario, it makes us analyze and get a vivid picture. If you find your niche in this sphere, we are providing you with a chance to grab this opportunity. So, wear your thinking hats, Very less is needed to come up, it is all within yourself, in your way of thinking","The network that connects us all, the web, it couldn’t have been what it is today without outstanding web developers. And to encourage such geniuses, we bring forth, Web Designing. The task, an interactive web page, with a number of details, is to be designed. The technologies that the designer may use are CSS, JS, and HTML or you can follow the path of .net and PHP. The choice is yours.",
            "This event is a hurdle race designed for robots. Teams will compete against each other while " +
                    "racing their robots on a track with hurdles. The winning team will be the one whose robot " +
                    "crosses the hurdles and finishes the race in minimum time. Penalty time will be added to the " +
                    "total time in case a hurdle is skipped or the robot touches the boundary.","Follow the path to success by designing an efficient line following robot. The event " +
            "comprises of a track laid in black strip on white sheet, having a starting and finishing line with " +
            "some intermediate checkpoints.","This event will have two teams competing against each other. There will be different balls in " +
            "the arena, which will have a hole in the center. Each ball will have some points. Participants " +
            "will try to get as many balls as they can, using their robots while their opponents try the same. " +
            "Teams can drop their opponents’ balls in the hole in order to prevent them from scoring those " +
            "points. The competitors can also knock out their opponents by knocking them into the hole " +
            "twice.","This event will mainly test the application based knowledge of the electronic circuits used for various purposes. It will cover designs from basic logical circuits to hardcore electrical circuits; their rectification and building of the correct circuit. It will comprise of different levels, including both hardware and software aspects, with increasing difficulty levels."
    ,"Get ready for an adrenaline rush and a test of your senses. Compete against participants of " +
            "different colleges to triumph as the best LAN gaming team. We have for you, first person " +
            "shooters, races and what not. So get ready to enter a world of virtual reality, and prove " +
            "yourself the best.","The box of miracles and secrets is waiting for you. Come and explore a whole new world " +
            "within. Experience fun, like you have never before. Apply your brain in every technical aspect " +
            "and hunt for the treasure.","Arguments are naturally constructive. They lead to a mind open to new ideas. In a field as " +
            "dynamic as technology, we need to argue to keep ourselves on our toes and constantly " +
            "updated. Thus, all our welcome to the technical debate.","This event calls out all the thinkers who can come up with great and green ideas, to make this " +
            "world a better place. These green ideas will help in sustainable development in the long run " +
            "and help make our present environment eco-friendly. So put on your thinking caps and give " +
            "us your best ideas.","It is said that knowledge increases when it is shared. Through this event we are giving " +
            "students an opportunity to share and increase their knowledge through a quiz competition. " +
            "The quiz will cover a variety of topics testing the participants’ knowledge in multiple fields. " +
            "Participants will face off against other geniuses in order to determine the smartest of them all. " +
            "So if you think that you have what it takes, take part and let your knowledge help you win the " +
            "title of the biggest ‘Know It All’.","A puzzle over which millions have spent millions of hours. The Rubik's Cube is a mind boggling toy. With its pivoting surfaces and only one correct solution, it truly takes a mastermind to solve it. But we are searching for a genius among geniuses. So come solve The Cube quicker than any other. Beat both, the puzzle and the solution."
    ,"Find the creative genius within you here at InfoX. If you are a graphic designer and wish for your work to be displayed before the world, we offer you a platform to do this. Come up with a T-shirt design which is innovative, unique and above all, awesome. Share your design and if chosen the best by public consensus, it’ll be the design for the official InfoXpression T-shirt. Prove that you are AlmighTEe.",
    "Mobile applications give us great power. They are something we can access on the go and perform our day to day tasks. A perfect application is creative, fast and actually useful. And these are the very parameters we look for in APP DEVELOPMENT.","Rooters is an online event that will witness teeming brains get drained as participants tackle innovative challenges while putting their ethical hacking skills to the test. Hackers will come together to solve a social problem through IT solutions to prove their mettle. And to raise the stakes even higher, they will have to do so against the clock within a prescribed time limit.","Do you believe in making people look at the world from your perspective? Then this is the event for you. Go creative, and give us a photograph that captures something breath-taking. Show us waht you bought that DSLR for and if you awe us enough, you will have achieved Xcel-Lens!",
            "Find the creative genius within you here at InfoX. If you are a graphic designer and wish for your work to be displayed before the world, we offer you a platform to do this. Come up with a T-shirt design which is innovative, unique and above all, awesome. Share your design and if chosen the best by public consensus, it’ll be the design for the official InfoXpression T-shirt. Prove that you are AlmighTEe.",
            "Mobile applications give us great power. They are something we can access on the go and perform our day to day tasks. A perfect application is creative, fast and actually useful. And these are the very parameters we look for in APP DEVELOPMENT.","Rooters is an online event that will witness teeming brains get drained as participants tackle innovative challenges while putting their ethical hacking skills to the test. Hackers will come together to solve a social problem through IT solutions to prove their mettle. And to raise the stakes even higher, they will have to do so against the clock within a prescribed time limit.",
    "Do you believe in making people look at the world from your perspective? Then this is the event for you. Go creative, and give us a photograph that captures something breath-taking. Show us waht you bought that DSLR for and if you awe us enough, you will have achieved Xcel-Lens!"};

    TextView heading,date,time,venue,desc;
    ImageView image;
    Button b1;
    Context c = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event__desc_final);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       //     getActionBar().hide();
        final_position = getIntent().getIntExtra("pos",0);
    //        pane = getIntent().getIntExtra("pane",0);
        heading = (TextView)findViewById(R.id.heading);
        image = (ImageView)findViewById(R.id.event_image);
        date = (TextView)findViewById(R.id.date);
        time = (TextView)findViewById(R.id.time);
        venue = (TextView)findViewById(R.id.venue);
        desc = (TextView)findViewById(R.id.desc);

        //setTitle(event_name[final_position]);




        /*switch(pane){
            case 0:
                switch(position){
                    case 0:
                        final_position=0;
                        break;
                    case 1:
                        final_position=1;
                        break;
                    case 2:
                        final_position=2;
                        break;
                    case 3:
                        final_position=3;
                        break;
                    case 4:
                        final_position=4;
                        break;

                }
                break;
            case 1:
                switch(position) {
                    case 0:
                        final_position = 5;
                        break;
                    case 1:
                        final_position = 6;
                        break;
                    case 2:
                        final_position = 7;
                        break;
                }
                break;
            case 2 :
                switch(position) {
                    case 0:
                        final_position = 8;
                        break;
                    case 1:
                        final_position = 9;
                        break;
                    case 2:
                        final_position = 10;
                        break;
                }
                break;}*/



////////////////////////////////////////////////////   CODE FOR FLOATING ACTION BUTTON////////////////////////////////////////////////////////

        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.plus  );
        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();
        //Create MENU ITEMS
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.calendar);
        button1 = itemBuilder.setContentView(itemIcon).setLayoutParams(new FrameLayout.LayoutParams(200,200)).build();

        SubActionButton.Builder itemBuilder1 = new SubActionButton.Builder(this);
        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.register_now1);
        button2 = itemBuilder1.setContentView(itemIcon2).setLayoutParams(new FrameLayout.LayoutParams(240,240)).build();


        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.domain);
        button3 = itemBuilder.setContentView(itemIcon3).setLayoutParams(new FrameLayout.LayoutParams(215, 215)).build();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Intent.ACTION_INSERT, CalendarContract.Events.CONTENT_URI);
                startActivity(intent);

                //Toast.makeText(Event_DESC_final.this,"Calendar",Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Event_DESC_final.this,Registeration_Form.class);
                i.putExtra("pos",final_position);
                startActivity(i);

                //Toast.makeText(Event_DESC_final.this,"Register",Toast.LENGTH_SHORT).show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://http://www.ipu.ac.in/infox15/index.html";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                //Toast.makeText(Event_DESC_final.this,"Website",Toast.LENGTH_SHORT).show();
            }
        });

        /*
        ImageView itemIcon3 = new ImageView(this);
        itemIcon.setImageResource(R.drawable.car3);
        SubActionButton button3 = itemBuilder.setContentView(itemIcon).build();*/

        //CREATE THE MENU
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)


                        // ...
                .attachTo(actionButton)
                .build();
        ///////////////////////////////////////////////////////////CODE FOR FLOATING ACTION BUTTON/////////////////////////////////



        //setTitle(event_name[final_position]);

       // tv.setText("Final_Position " + final_position+ " Pane " + pane+ "  Position: "+position.toString());

        heading.setText(event_name[final_position]);
        image.setImageResource(images[final_position]);
        desc.setText(event_desc[final_position]);
        date.setText(dates[final_position]);
        time.setText(times[final_position]);
        venue.setText(venues[final_position]);

        /*switch(final_position)
        {
            case 0:
                heading.setText(event_name[2]);//codester
                image.setImageResource(R.drawable.codester);
                desc.setText(event_desc[2]);

                break;
            case 1:
                heading.setText(event_name[1]);//javajig
                image.setImageResource(R.drawable.javajig);
                desc.setText(event_desc[1]);
                break;
            case 2:
                heading.setText(event_name[4]);//linux ninja
                image.setImageResource(R.drawable.linux);
                desc.setText(event_desc[4]);
                break;
            case 3:
                heading.setText(event_name[0]);//Algoholics
                image.setImageResource(R.drawable.algoholics);
                desc.setText(event_desc[0]);
                break;
            case 4:
                heading.setText(event_name[3]);//Back Gear
                image.setImageResource(R.drawable.backgear);
                desc.setText(event_desc[3]);
                break;
            case 5:heading.setText("Datbase");//Database
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;






        }
*/
    }





   /* public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event__desc_final, menu);
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
       *//* else if (id==R.id.home)
        {
            finish();
            return true;

        }*//*

        return super.onOptionsItemSelected(item);
    }
*/


}
