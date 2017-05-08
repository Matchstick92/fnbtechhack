package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.R;
import com.fnbtechhack.foodups.RestaurantItem;

public class MockRestaurantsData
{
    private static final RestaurantItem[] mItems = new RestaurantItem[] {
        new RestaurantItem(1, "SLIM BOYZ", R.drawable.restauranta, "Western", "Dhoby Ghaut"),
        new RestaurantItem(2, "Restaurant B", R.drawable.restaurantb, "Korean", "Dhoby Ghaut"),
        new RestaurantItem(3, "Restaurant C", R.drawable.restaurantc, "Japanese", "Dhoby Ghaut")
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
