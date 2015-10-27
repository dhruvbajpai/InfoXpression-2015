package com.infox.dhruv.techfest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;

/**
 * Created by Dhruv on 11-Feb-15.
 */
public class Location extends Activity {

    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","TILL HERE IN MAPS");
        setContentView(R.layout.activity_registeration__form);

       /* createMapView();
        addMarker();*/

    }
}
/*
    private void addMarker() {

        if(null != googleMap){
            googleMap.addMarker(new MarkerOptions()
                            .position(new LatLng(0, 0))
                            .title("Marker")
                            .draggable(true)
            );
        }
    }

    protected void createMapView() {

        try {
            if(null == googleMap){
                googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                        R.id.mapView)).getMap();

                *//**
                 * If the map is still null after attempted initialisation,
                 * show an error to the user
                 *//*
                if(null == googleMap) {
                    Toast.makeText(getApplicationContext(),
                            "Error creating map", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (NullPointerException exception){
            Log.e("mapApp", exception.toString());
        }
    }
}*/
