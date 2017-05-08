package com.fnbtechhack.foodups;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.fnbtechhack.foodups.data.MenuItemFragment;
import com.fnbtechhack.foodups.data.MockRestaurantMenu;
import com.fnbtechhack.foodups.data.MockRestaurantsData;

import java.util.ArrayList;
import java.util.Arrays;

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

        TextView restaurantName = (TextView) view.findViewById(R.id.restaurant_name_textview);
        restaurantName.setText(item.name);

        ImageView image = (ImageView) view.findViewById(R.id.restaurant_image);
        image.setImageResource(item.image);

        // add menu items to list.
        ListView listView = (ListView) view.findViewById(R.id.restaurant_menu_list);

        MockRestaurantMenu menuHelper = new MockRestaurantMenu();
        MenuItem[] menuItems = menuHelper.data();

        ArrayList<MenuItem> list = new ArrayList<>(Arrays.asList(menuItems));
        listView.setAdapter(new RestaurantMenuItemAdapter(getActivity(), R.layout.restaurant_menu_item, list));

        // if restaurant is clicked, call RestaurantViewFragment with parent of RestaurantsFragment
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> adapter, View view, int i, long l)
                    {
                        MenuItem value = (MenuItem) adapter.getItemAtPosition(i);

                        Bundle bundle = new Bundle();
                        bundle.putInt(getResources().getString(R.string.menu_key), value.id);
                        MenuItemFragment fragment = new MenuItemFragment();
                        fragment.setArguments(bundle);

                        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        // launch RestaurantViewFragment from id
                        getFragmentManager().beginTransaction()
                                .replace(R.id.main_container, fragment)
                                .addToBackStack(null)
                                .commit();
                    }
                });

        return view;
    }
}
