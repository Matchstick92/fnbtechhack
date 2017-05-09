package com.fnbtechhack.foodups;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fnbtechhack.foodups.data.MockRestaurantsData;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantsFragment extends android.support.v4.app.Fragment
{
    private static final String LOG_TAG = RestaurantsFragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        MockRestaurantsData obj = new MockRestaurantsData();
        RestaurantItem[] mRestaurants = obj.MockData();

        // populate fragment with listView of restaurants
        ListView restaurants = (ListView) view.findViewById(R.id.restaurant_list);
        ArrayList<RestaurantItem> list = new ArrayList<>(Arrays.asList(mRestaurants));
        restaurants.setAdapter(new RestaurantItemAdapter(getActivity(), R.layout.restaurant_list_item, list));

        // if restaurant is clicked, call RestaurantViewFragment with parent of RestaurantsFragment
        restaurants.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int i, long l)
            {
                RestaurantItem value = (RestaurantItem) adapter.getItemAtPosition(i);

                Bundle bundle = new Bundle();
                bundle.putInt(getResources().getString(R.string.restaurant_key), value.id);
                RestaurantViewFragment fragment = new RestaurantViewFragment();
                fragment.setArguments(bundle);

                ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                // launch RestaurantViewFragment from id
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}
