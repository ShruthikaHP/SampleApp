package com.example.sample.sampleapp;

/**
 * Created by supre on 11/17/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Our class extending fragment
public class Tab3 extends Fragment {

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab3 in you classes
        return inflater.inflate(R.layout.tab3, container, false);
    }
}