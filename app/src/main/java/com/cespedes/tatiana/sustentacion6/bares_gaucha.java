package com.cespedes.tatiana.sustentacion6;


import android.app.Activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class bares_gaucha extends Fragment implements GoogleMap.OnMapLoadedCallback{

    private GoogleMap mMap;


    public bares_gaucha() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bares_gaucha, container, false);
    }

    public void onMapReady(GoogleMap googleMap){
        LatLng lgaucha = new LatLng(6.964576651, -75.413435);
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lgaucha));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        mMap.addMarker(new MarkerOptions().position(lgaucha).title("Hola").snippet("Rumba"));

    }


    @Override
    public void onMapLoaded() {

    }
}
