package com.fnbtechhack.foodups.data;

import com.fnbtechhack.foodups.MenuItemAddon;
import com.fnbtechhack.foodups.MenuItemOption;

import java.util.ArrayList;

public class MockMenuItemAddons
{
    public MenuItemAddon[] mAddons= {
            new MenuItemAddon(1,1,"Cheese", 0.00),
            new MenuItemAddon(2,1,"Mushrooms", 3.00),
            new MenuItemAddon(3,1,"Pineapple", 5.00)
    };



    public MenuItemAddon[] data()
    {
        return mAddons;
    }

    public MenuItemAddon findMenuItemById(int id)
    {
        for(MenuItemAddon item : mAddons)
        {
            if(item.id == id)
            {
                return item;
            }
        }

        return null;
    }

    public ArrayList<MenuItemAddon> findMenuItemByMenuId(int id)
    {
        ArrayList<MenuItemAddon> optionsByMenuId = new ArrayList<>();
        for(MenuItemAddon item : mAddons)
        {
            if(item.menuItemId == id)
            {
                optionsByMenuId.add(item);
            }
        }

        return optionsByMenuId;
    }
}
