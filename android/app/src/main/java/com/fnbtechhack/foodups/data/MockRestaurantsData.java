package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.R;
import com.fnbtechhack.foodups.RestaurantItem;

public class MockRestaurantsData
{
    private static final RestaurantItem[] mItems = new RestaurantItem[] {
        new RestaurantItem(1, "SLIM BOYZ", R.drawable.restauranta, "Western", "150m"),
        new RestaurantItem(2, "Jim's Restaurant", R.drawable.restaurantb, "Korean", "400m"),
        new RestaurantItem(3, "Kenki Sushi", R.drawable.restaurantc, "Japanese", "500m")
    };

    public RestaurantItem[] MockData()
    {
        // fixed items for demo
        return mItems;
    }

    public RestaurantItem findRestaurantById(int id)
    {
        for(RestaurantItem item : mItems)
        {
            if(item.id == id)
            {
                return item;
            }
        }

        return null;
    }
}
