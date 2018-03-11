package com.mobbilecomputer.bnu.retrofitandroidconnectivity;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Dashboard extends Fragment{

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior  bottomSheetBehavior;
    private ImageView imageView;
    private DrawerLayout mDrwaerLayout;
    private ActionBarDrawerToggle nToggle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        DrawerLayout drawerLayout = view.findViewById(R.id.nav_mai);




        bottomsheetlayout = view.findViewById(R.id.bottomsheet);
        imageView = view.findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);
        //state hidden

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        //state collapsed

        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //state expanded
        //  bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        return view;
    }



}
