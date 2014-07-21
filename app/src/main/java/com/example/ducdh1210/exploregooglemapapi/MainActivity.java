package com.example.ducdh1210.exploregooglemapapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {

    private final LatLng LOCATION_BURNABY = new LatLng(49.27645, -122.917587);
    private final LatLng LOCATION_SURREY = new LatLng(49.187500, -122.849000);


    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        map.addMarker(new MarkerOptions().position(LOCATION_SURREY).title("Find me here"));
    }

    public void onClick_City(View v){
        //CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BURNABY, 9);
        map.animateCamera(update);
    }

    public void onClick_Burnaby(View v){
        //CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
        map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BURNABY, 14);
        map.animateCamera(update);
    }

    public void onClick_Surrey(View v){
        //CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BURNABY, 16);
        map.animateCamera(update);
    }



}
