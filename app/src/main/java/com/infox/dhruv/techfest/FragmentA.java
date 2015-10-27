package com.infox.dhruv.techfest;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
//import android.support.v4.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class FragmentA extends android.support.v4.app.Fragment {

    Integer pane=0;
    View v;
    String[] dates = new String[]{"14th March","13th March","15th March","15th March","13th March","13th March","14th March","14th March","13th March","15th March","14th March","13th March","15th March","14th March","15th March","15th March","13th March","Running","Running","Running","Running"};
    Integer[] images = new Integer[]{R.drawable.algoholics,R.drawable.codester,R.drawable.javajig,R.drawable.linux,R.drawable.backgear,R.drawable.datacrunch,R.drawable.weebee,R.drawable.roborace,
            R.drawable.mind_the_line,R.drawable.robohustle,R.drawable.circuitrix,R.drawable.col,R.drawable.crusade,R.drawable.geekwars,R.drawable.green,R.drawable.know_all,R.drawable.rubix,R.drawable.almightee,R.drawable.bootstrapp,R.drawable.rooters,R.drawable.xcelens,};
    String[] event_name = new String[]{"ALGOHOLICS","CODECHEF","JAVA JIG","LINUX NINJA","BACK GEAR","DATA CRUNCHERS","WEB-BEE","ROBO-RACE","MIND THE LINE","ROBO-HUSTLE","CIRCUITRIX","CLASH-ON-LAN","CRUSADE","GEEK WARS","GREENOVATION","KNOW-IT-ALL","RUBIX","AlMIGHTee","BOOTSTRAPP","ROOTERS","XCEL-LENS"};
    String[] event_desc = new String[]{"We are obsessed with solutions to all our problems. But we know that a problem may have " +
            "any number of solutions. To find out the least complex path to our solutions we bring you " +
            "algoholics. Write the best pseudo code and prove your mettle.","Codechef Codester Event for The Programmers under the Umbrella of Codechef. The event includes multiple algorithm based problems that have to be solved under a limited time frame of 4 hours. The team to submit the maximum no. of correct solutions will be declared as the winners. There is no negative marking so a team can make any no. of submissions . Code in any programming language. Due to large no. of registrations received very few slots are left. Register and win lots of prizes. Last day of registration 13th March 2015 before 00:00 .The students participating in the competition will be short listed through a flash quiz round. Limited No of seats .HURRY! Great Prizes and certificates to be won! " +
            "Date: 13th February " +
            "Venue: GGSIPU Dwarka Sec-16C E-block  " +
            "Time: 12 Noon to 8 Pm","JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s " +
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
    String[] values = new String[]{"Message1", "Message2", "Message3"};
    /*Integer[] images = new Integer[]{R.drawable.algoholics,R.drawable.javajig,R.drawable.backgear,R.drawable.codester,R.drawable.linux,R.drawable.mind_the_line,
    R.drawable.robohustle,R.drawable.roborace,R.drawable.col,R.drawable.crusade,R.drawable.geekwars};

    String[] event_name = new String[]{"ALGOHOLICS","JAVA JIG","CODESTER","BACK GEAR","LINUX COMMAND NINJA","MIND THE LINE","ROBO-HUSTLE","ROBO-RACE","CLASH-ON-LAN","CRUSADE","GEEK WARS"};
    String[] event_desc = new String[]{"We are obsessed with solutions to all our problems. But we know that a problem may have\n" +
            "any number of solutions. To find out the least complex path to our solutions we bring you\n" +
            "algoholics. Write the best pseudo code and prove your mettle.","JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s\n" +
            "contributions have been innumerable. Called the most robust programming language, the\n" +
            "JAVA JIG tests your proficiency in this language. It will test how well you know the nuances\n" +
            "of JAVA as well as your skills as a coder.","To challenge your very basic understanding of object oriented programming, we bring to you\n" +
            "the C++ code jam. Here we check not only your problem solving skills, but also your grasp\n" +
            "over this fascinating language.","This contest will challenge the conventional norms of programming where in a programmer\n" +
            "generates output from the code. Here, we present the competitors with the output and the\n" +
            "programmers are required to apply their reverse engineering skills to generate the code that\n" +
            "gives this output.",">Linux was a work of genius. An operating system that was free. Not only that, you could\n" +
            "contribute in making it better. This gave birth to a community formed of programmers with\n" +
            "great skill. To salute this phenomena of open source technology, we bring to you the LINUX\n" +
            "COMMAND NINJA. Show the world how well you know the linux command line and how can\n" +
            "you contribute to this dynamic technology.","Linux was a work of genius. An operating system that was free. Not only that, you could\n" +
            "contribute in making it better. This gave birth to a community formed of programmers with\n" +
            "great skill. To salute this phenomena of open source technology, we bring to you the LINUX\n" +
            "COMMAND NINJA. Show the world how well you know the linux command line and how can\n" +
            "you contribute to this dynamic technology.","Follow the path to success by designing an efficient line following robot. The event\n" +
            "comprises of a track laid in black strip on white sheet, having a starting and finishing line with\n" +
            "some intermediate checkpoints.","This event will have two teams competing against each other. There will be different balls in\n" +
            "the arena, which will have a hole in the center. Each ball will have some points. Participants\n" +
            "will try to get as many balls as they can, using their robots while their opponents try the same.\n" +
            "Teams can drop their opponents’ balls in the hole in order to prevent them from scoring those\n" +
            "points. The competitors can also knock out their opponents by knocking them into the hole\n" +
            "twice.","This event is a hurdle race designed for robots. Teams will compete against each other while\n" +
            "racing their robots on a track with hurdles. The winning team will be the one whose robot\n" +
            "crosses the hurdles and finishes the race in minimum time. Penalty time will be added to the\n" +
            "total time in case a hurdle is skipped or the robot touches the boundary.","Get ready for an adrenaline rush and a test of your senses. Compete against participants of\n" +
            "different colleges to triumph as the best LAN gaming team. We have for you, first person\n" +
            "shooters, races and what not. So get ready to enter a world of virtual reality, and prove\n" +
            "yourself the best.","The box of miracles and secrets is waiting for you. Come and explore a whole new world\n" +
            "within. Experience fun, like you have never before. Apply your brain in every technical aspect\n" +
            "and hunt for the treasure.","Arguments are naturally constructive. They lead to a mind open to new ideas. In a field as\n" +
            "dynamic as technology, we need to argue to keep ourselves on our toes and constantly\n" +
            "updated. Thus, all our welcome to the technical debate."};
*/
    //String[] list = {"Competition 1","Competition 2"};
    private List<Event> t_events ;
    int position =0;
    int fin_pos=0;

    public FragmentA() {

        this.position = position;
        //this.fin_pos= position;
        //this.position = getArguments().getInt("pos");
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

        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        this.v = rootView;
        int temp_pos = getArguments().getInt("bpos");
        position = fin_pos = temp_pos;

        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        // android.R.layout.simple_list_item_1, values);


        //populateListView();

        //setListAdapter(adapter);


        return rootView;

    }
    @Override
    public void onResume() {
        super.onResume();
        t_events = new ArrayList<Event>();
        populateEventList();
        final ArrayAdapter<Event> adapter = new MyListAdapter(getActivity().getBaseContext(), values);
        ((ListView)v.findViewById(R.id.list)).setAdapter(adapter);
        ((ListView)v.findViewById(R.id.list)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getActivity().getBaseContext(),Event_DESC_final.class);
                int num=0;
                switch (pane){
                    case 0:
                        i.putExtra("pos",position);
                        break;
                    case 1:
                        fin_pos = 7+ position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 2:
                        fin_pos = 11+ position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 3:
                        fin_pos = 17 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                }
                //i.putExtra("pos",fin_pos);
                i.putExtra("pane",pane);
                //Toast.makeText(getActivity().getBaseContext(),"Pane: "+pane+"Position: "+position,Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

    }

    public void populateEventList() {
            switch (position)
            {
                case 0:
                    pane =0;
                    t_events.add(new Event(event_name[1],images[1],event_desc[1], "Programming",dates[1]));
                    t_events.add(new Event(event_name[0],images[0],event_desc[0], "Programming",dates[0]));

                    t_events.add(new Event(event_name[2],images[2],event_desc[2], "Programming",dates[2]));
                    t_events.add(new Event(event_name[3],images[3],event_desc[3], "Programming",dates[3]));
                    t_events.add(new Event(event_name[4],images[4],event_desc[4], "Programming",dates[4]));
                    t_events.add(new Event(event_name[5],images[5],event_desc[5], "Programming",dates[5]));
                    t_events.add(new Event(event_name[6],images[6],event_desc[6], "Programming",dates[6]));

                    break;
                case 1:
                    pane =1;
                    t_events.add(new Event(event_name[7],images[7],event_desc[7], "Electronics",dates[7]));
                    t_events.add(new Event(event_name[8],images[8],event_desc[8], "Electronics",dates[8]));
                    t_events.add(new Event(event_name[9],images[9],event_desc[9], "Electronics",dates[9]));
                    t_events.add(new Event(event_name[10],images[10],event_desc[10], "Electronics",dates[10]));
                    break;
                case 2:
                    pane =2;
                    t_events.add(new Event(event_name[11],images[11],event_desc[11], "Non-Tech",dates[11]));
                    t_events.add(new Event(event_name[12],images[12],event_desc[12], "Non-Tech",dates[12]));
                    t_events.add(new Event(event_name[13],images[13],event_desc[13], "Non-Tech",dates[13]));
                    t_events.add(new Event(event_name[14],images[14],event_desc[14], "Non-Tech",dates[14]));
                    t_events.add(new Event(event_name[15],images[15],event_desc[15], "Non-Tech",dates[15]));
                    t_events.add(new Event(event_name[16],images[16],event_desc[16], "Non-Tech",dates[16]));
                    break;
                case 3:
                    pane =3;


                    t_events.add(new Event(event_name[17],images[17],event_desc[17], "Online",dates[17]));
                    t_events.add(new Event(event_name[18],images[18],event_desc[18], "Online",dates[18]));
                    t_events.add(new Event(event_name[19],images[19],event_desc[19], "Online",dates[19]));
                    t_events.add(new Event(event_name[20],images[20],event_desc[20], "Online",dates[20]));
                    break;
                /*default:
                    t_events.add(new Event(event_name[8],images[8],event_desc[8], "Non-Technical","Feb 13"));
                    t_events.add(new Event(event_name[9],images[9],event_desc[9], "Non-Technical","Feb 13"));
                    t_events.add(new Event(event_name[10],images[10],event_desc[10], "Non-Technical","Feb 13"));
                    break;*/


            }




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
        private int lastPosition = -1;




        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with(may have been given null)

            final ViewHolder holder;
            View itemView = convertView;
            if (itemView == null) {
                itemView = getActivity().getLayoutInflater().inflate(R.layout.item_views_list, parent, false);
                holder = new ViewHolder();

                holder.imageView = (ImageView) itemView.findViewById(R.id.imgview);
                holder.event_name_Text = (TextView) itemView.findViewById(R.id.evntname);
               holder.event_date = (TextView)itemView.findViewById(R.id.date);
                holder.event_category = (TextView)itemView.findViewById(R.id.category);
                holder.event_dedc_Text = (TextView) itemView.findViewById(R.id.evntdesc);
                itemView.setTag(holder);
            }else {

                holder = (ViewHolder)itemView.getTag();
            }
            //Find the car to work with.

            final Event currentevent = t_events.get(position);
            //Fill the View
             

                   holder.imageView.setImageResource(currentevent.getImage_id());
            holder.event_date.setText(currentevent.getDate().toString());


//            holder.imageView.setImageResource(currentevent.getImage_id());
            holder.imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Toast.makeText(getActivity(), "Event of " + currentevent.getEvent_name() + " Clicked", Toast.LENGTH_SHORT).show();

                }
            });
            //Make

            holder.event_name_Text.setText(currentevent.getEvent_name());


            holder.event_date.setText(currentevent.getDate());

            //TextView event_category = (TextView)itemView.findViewById(R.id.category);
            holder.event_category.setText(currentevent.getCategory());
            //Year
            //TextView event_dedc_Text = (TextView) itemView.findViewById(R.id.evntdesc);
            holder.event_dedc_Text.setText(currentevent.getEvent_desc());

            /*//Condition
            TextView conditionText = (TextView)itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());*/
            /*Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
            itemView.startAnimation(animation);
            lastPosition = position;*/
            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }


    class MyTask extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected Void doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }

    static class ViewHolder{
        ImageView imageView;
        TextView event_name_Text;
        TextView event_date;
        TextView event_category;
        TextView event_dedc_Text;

    }

}



