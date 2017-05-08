package com.fnbtechhack.foodups;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fnbtechhack.foodups.data.MockRestaurantMenu;
import com.fnbtechhack.foodups.data.MockRestaurantsData;

public class RestaurantViewFragment extends Fragment
{
    private static final String LOG_TAG = RestaurantViewFragment.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_restaurant_view, container, false);
        int rid = getArguments().getInt(getResources().getString(R.string.restaurant_key));

        Log.v(LOG_TAG, "Restaurant ID is " + Integer.toString(rid));

        MockRestaurantsData helper = new MockRestaurantsData();
        RestaurantItem item = helper.findRestaurantById(rid);

        ImageView image = (ImageView) view.findViewById(R.id.restaurant_image);
        image.setImageResource(item.image);

        // add menu items to list.
        MockRestaurantMenu menuHelper = new MockRestaurantMenu();
        MenuItem[] menuItems = menuHelper.data();

        RestaurantMenuItemAdapter

        return view;
    }
}
