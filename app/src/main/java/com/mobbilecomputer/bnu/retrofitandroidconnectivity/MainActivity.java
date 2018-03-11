package com.mobbilecomputer.bnu.retrofitandroidconnectivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrwaerLayout;
    private ActionBarDrawerToggle nToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrwaerLayout = findViewById(R.id.nav_mai);
        nToggle = new ActionBarDrawerToggle(this,mDrwaerLayout,R.string.open,R.string.close);
        mDrwaerLayout.addDrawerListener(nToggle);
        nToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(nToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

   //     Fragment fragment = null;
        int id = item.getItemId();
        if(id== R.id.home){
             mDrwaerLayout.closeDrawers();
           // nToggle.onDrawerClosed(mDrwaerLayout);
            Dashboard  fragment = new Dashboard();
            FragmentManager manager  = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragment,fragment);
            transaction.commit();
            //Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        }
        if(id== R.id.setting){
            mDrwaerLayout.closeDrawers();
            Setting fragment = new Setting();
            Toast.makeText(this,"logout",Toast.LENGTH_LONG).show();
            FragmentManager manager  = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragment,fragment);
            transaction.commit();
              Toast.makeText(this,"setting",Toast.LENGTH_LONG).show();
       //     fragment = new Setting();
        }
        if(id== R.id.log){

            mDrwaerLayout.closeDrawers();
           Logout fragment  = new Logout();
            Toast.makeText(this,"logout",Toast.LENGTH_LONG).show();
            FragmentManager manager  = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragment,fragment);
            transaction.commit();
        }


        return false;
    }


}
