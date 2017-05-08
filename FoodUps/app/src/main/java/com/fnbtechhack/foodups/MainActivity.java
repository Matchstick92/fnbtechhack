package com.fnbtechhack.foodups;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String INIT_TAG = "INIT";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
        {   // load summary fragment for the shop
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container, new RestaurantsFragment(), INIT_TAG).commit();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item)
    {
        Log.v(LOG_TAG, "Selecting item.");
        int id = item.getItemId();
        Log.v(LOG_TAG, "Selected ID is " + id);
        if (id == R.id.action_settings)
        {
            return true;
        }
        else if (id == R.id.home)
        {
            Log.v(LOG_TAG, "Attempting to pop backstack");
            getSupportFragmentManager().popBackStackImmediate();
        }

        return super.onOptionsItemSelected(item);
    }
}
