package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.MenuItem;
import com.fnbtechhack.foodups.R;

public class MockRestaurantMenu
{
    private static final MenuItem[] mMenuItems = {
            new MenuItem(1, 1, "WAGYU WAITING FOR?", R.drawable.ic_menu_share, 8.00),
            new MenuItem(2, 1, "Truffle Shuffle", R.drawable.ic_menu_share, 9.00),
            new MenuItem(3, 1, "Hawaiian Paradise", R.drawable.ic_menu_share, 7.00),
            new MenuItem(4, 1, "Pepperoni Madness", R.drawable.ic_menu_share, 7.00),
            new MenuItem(5, 1, "Move over, there isn't mushroom", R.drawable.ic_menu_share, 10.00),
            new MenuItem(6, 1, "I love you from my head tomatoes", R.drawable.ic_menu_share, 9.00),
            new MenuItem(7, 1, "So cheesy", R.drawable.ic_menu_share, 7.00),
            new MenuItem(8, 1, "Move Over, There Isn't Mushroom", R.drawable.ic_menu_share, 10.00),
            new MenuItem(9, 1, "I Love You From My Head Tomatoes", R.drawable.ic_menu_share, 7.00),
            new MenuItem(10, 1, "Prawn Avocado Sesame Rice", R.drawable.ic_menu_share, 12.00),
            new MenuItem(11, 1, "Roast Chicken Feta", R.drawable.ic_menu_share, 10.00),
            new MenuItem(12, 1, "Caesar Salad ", R.drawable.ic_menu_share, 11.00),
            new MenuItem(13, 1, "Teriyaki Chicken Noodle", R.drawable.ic_menu_share, 10.00),
            new MenuItem(14, 1, "Tropical Chicken", R.drawable.ic_menu_share, 11.00),
            new MenuItem(15, 1, "Western Bacon Cheeseburger", R.drawable.ic_menu_share, 14.00),
            new MenuItem(16, 1, "chili Cheeseburger", R.drawable.ic_menu_share, 11.00),
            new MenuItem(17, 1, "Guacamole Bacon Cheeseburger", R.drawable.ic_menu_share, 12.00),
            new MenuItem(18, 1, "Portobello Mushroom Burger", R.drawable.ic_menu_share, 11.00)
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
