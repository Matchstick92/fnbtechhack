package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.MenuItem;
import com.fnbtechhack.foodups.R;

import java.util.ArrayList;

public class MockRestaurantMenu
{
    private static final MenuItem[] mMenuItems = {
            new MenuItem(1, 1, "WAGYU WAITING FOR?", R.drawable.restauranta, 8.00),
            new MenuItem(2, 1, "Truffle Shuffle", R.drawable.restauranta, 9.00),
            new MenuItem(3, 1, "Hawaiian Paradise", R.drawable.restauranta, 7.00),
            new MenuItem(4, 1, "Pepperoni Madness", R.drawable.restauranta, 7.00),
            new MenuItem(5, 1, "Move over, there isn't mushroom", R.drawable.restauranta, 10.00),
            new MenuItem(6, 1, "I love you from my head tomatoes", R.drawable.restauranta, 9.00),
            new MenuItem(7, 1, "So cheesy", R.drawable.restauranta, 7.00),
            new MenuItem(8, 1, "Move Over, There Isn't Mushroom", R.drawable.restauranta, 10.00),
            new MenuItem(9, 1, "I Love You From My Head Tomatoes", R.drawable.restauranta, 7.00),
            new MenuItem(10, 2, "Prawn Avocado Sesame Rice", R.drawable.restauranta, 12.00),
            new MenuItem(11, 2, "Roast Chicken Feta", R.drawable.restauranta, 10.00),
            new MenuItem(12, 2, "Caesar Salad ", R.drawable.restauranta, 11.00),
            new MenuItem(13, 2, "Teriyaki Chicken Noodle", R.drawable.restauranta, 10.00),
            new MenuItem(14, 2, "Tropical Chicken", R.drawable.restauranta, 11.00),
            new MenuItem(15, 3, "Western Bacon Cheeseburger", R.drawable.restauranta, 14.00),
            new MenuItem(16, 3, "chili Cheeseburger", R.drawable.restauranta, 11.00),
            new MenuItem(17, 3, "Guacamole Bacon Cheeseburger", R.drawable.restauranta, 12.00),
            new MenuItem(18, 3, "Portobello Mushroom Burger", R.drawable.restauranta, 11.00)
    };



    public MenuItem[] data()
    {
        return mMenuItems;
    }

    public MenuItem findMenuItemById(int id)
    {
        for(MenuItem item : mMenuItems)
        {
            if(item.id == id)
            {
                return item;
            }
        }

        return null;
    }

    public ArrayList<MenuItem> findMenuItemByRestaurantId(int id)
    {
        ArrayList<MenuItem> itemsByRestaurantId = new ArrayList<>();
        for(MenuItem item : mMenuItems)
        {
            if(item.restaurantId == id)
            {
                itemsByRestaurantId.add(item);
            }
        }

        return itemsByRestaurantId;
    }
}
