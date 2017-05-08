package com.fnbtechhack.foodups;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RestaurantViewFragment extends Fragment
{
    private static final String LOG_TAG = RestaurantViewFragment.class.getSimpleName();

    private static final MenuItem[] mMenuItems = {
        new MenuItem(1, 1, "WAGYU WAITING FOR?", R.drawable.ic_menu_share, 8.00),
        new MenuItem(2, 1, "Truffle Shuffle", R.drawable.ic_menu_share, 8.00),
        new MenuItem(3, 1, "Hawaiian Paradise", R.drawable.ic_menu_share, 8.00),
        new MenuItem(4, 1, "Pepperoni Madness", R.drawable.ic_menu_share, 8.00),
        new MenuItem(5, 1, "Move over, there isn't mushroom", R.drawable.ic_menu_share, 8.00),
        new MenuItem(6, 1, "I love you from my head tomatoes", R.drawable.ic_menu_share, 8.00),
        new MenuItem(7, 1, "So cheesy", R.drawable.ic_menu_share, 8.00),
        new MenuItem(8, 1, "Move Over, There Isn't Mushroom", R.drawable.ic_menu_share, 8.00),
        new MenuItem(9, 1, "I Love You From My Head Tomatoes", R.drawable.ic_menu_share, 8.00)
    };

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



        return view;
    }
}
