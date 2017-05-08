package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.MenuItem;
import com.fnbtechhack.foodups.R;

public class MockRestaurantMenu
{
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
}
