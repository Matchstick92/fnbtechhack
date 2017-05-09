package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.MenuItem;
import com.fnbtechhack.foodups.MenuItemAddon;
import com.fnbtechhack.foodups.MenuItemOption;

import java.util.ArrayList;

/**
 * Created by jason on 9/5/2017.
 */

public class MockMenuItemOptions
{
    public MenuItemOption[] mOptions = {
            new MenuItemOption(1,1,"Small", 0.00),
            new MenuItemOption(2,1,"Medium", 3.00),
            new MenuItemOption(3,1,"Large", 5.00)
    };


    public MenuItemOption[] data()
    {
        return mOptions;
    }

    public MenuItemOption findMenuItemById(int id)
    {
        for(MenuItemOption item : mOptions)
        {
            if(item.id == id)
            {
                return item;
            }
        }

        return null;
    }

    public ArrayList<MenuItemOption> findMenuItemByMenuId(int id)
    {
        ArrayList<MenuItemOption> optionsByMenuId = new ArrayList<>();
        for(MenuItemOption item : mOptions)
        {
            if(item.menuItemId == id)
            {
                optionsByMenuId.add(item);
            }
        }

        return optionsByMenuId;
    }
}
