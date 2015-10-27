package com.infox.dhruv.techfest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.parse.ParseObject;
import com.parse.ParseUser;


public class Registeration_Form extends ActionBarActivity implements AdapterView.OnItemSelectedListener,View.OnClickListener {
    String competition_name = new String();
    Spinner spinner;
    Button submit;
    EditText t1,t2,t3,t4;
    ParseObject myobject;
    ParseUser myUser;
    //String comp = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*ParseObject testObject = new ParseObject("PLAYING");
        testObject.put("foo", "HAPPY");
        testObject.saveInBackground();*/



        setContentView(R.layout.registration_form);
        //setTitle("REGISTERATION FORM");
        //getActionBar().hide();
        getSupportActionBar().hide();

        //getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
        submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(this);
        /*submit.setOnClickListener(new View.OnClickListener() {//THE SUBMIT  FORM CODE
            @Override
            public void onClick(View v) {
                *//*ParseObject MyObject = new ParseObject("Entries");
                MyObject.put("Name", "Dhruv");
                MyObject.put("Phone", "9899881387");
                MyObject.put("E-Mail", "dbcoolster@gmail.com");
                MyObject.saveInBackground();*//*


               *//*ParseObject p1 = new ParseObject(competition_name);

                p1.put("Name",t1.getText().toString());
                p1.put("Phone",t2.getText().toString());
                p1.put("E-Mail",t3.getText().toString());
                p1.saveInBackground();
                Toast.makeText(Registeration_Form.this,competition_name,Toast.LENGTH_SHORT).show();*//*
            }
        });*/



    }

    @Override
    protected void onStart() {
        super.onStart();
        t1 = (EditText)findViewById(R.id.et_name);
        t2 = (EditText)findViewById(R.id.et_phone);
        t3 = (EditText)findViewById(R.id.et_mail);
        t4= (EditText)findViewById(R.id.et_college);
        spinner = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.comp, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        myobject = new ParseObject("Entries");
        /*myobject.put("Name", "Dhruv");
        myobject.saveInBackground();
        myobject.put("Phone", "9899881387");
        myobject.saveInBackground();
        myobject.put("EMail", "dbcoolster@gmail.com");
        myobject.saveInBackground();*/




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registeration__form, menu);
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        competition_name = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        /*if(t1.getText().toString()==""||t2.getText().toString()==""||t3.getText().toString()=="")
        {
            Toast.makeText(this,"Fill the contents of the Form",Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this, "You are Registered for the Event....GO BACK and Fetch more", Toast.LENGTH_SHORT).show();
        }*/

       //ParseObject testObject = new ParseObject("ENTRYTABLE");
        String name = t1.getText().toString();
        String phone = t2.getText().toString();
        String mail = t3.getText().toString();
        String collg = t4.getText().toString();
        String comp = competition_name;
        comp=comp.replaceAll("\\s+","");
        myobject = new ParseObject(comp);
        myobject.put("Name", name);
        myobject.saveInBackground();
        myobject.put("Phone", phone);
        myobject.saveInBackground();
        myobject.put("EMail", mail);
        myobject.saveInBackground();
        myobject.put("College", collg);
        myobject.saveInBackground();
        Intent i = new Intent(Registeration_Form.this,registered.class);
        startActivity(i);
        //testObject.put("Name",t1.getText().toString());
        //testObject.put("Phone",t2.getText().toString());
        //testObject.put("E-Mail",t3.getText().toString());
        //testObject.saveInBackground();
        //myobject.saveInBackground();
       /* myUser = new ParseUser();
        myUser.setUsername(t1.getText().toString());
        myUser.setPassword("abrakadabra");
        myUser.setEmail(t3.getText().toString());
        myUser.put("Phone", t2.getText().toString());
        myUser.put("Branch","ECE");
        myUser.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    // Hooray! Let them use the app now.
                    Toast.makeText(Registeration_Form.this,"Registered",Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(Registeration_Form.this,"Not Registered",Toast.LENGTH_SHORT);
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });*/
    }
}
