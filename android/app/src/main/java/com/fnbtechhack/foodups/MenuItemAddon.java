package com.fnbtechhack.foodups;

import java.math.BigDecimal;

/**
 * Created by jason on 9/5/2017.
 */

public class MenuItemAddon
{
    public int id;
    public int menuItemId;
    public String addOnName;
    public BigDecimal addtionalCost;

    public MenuItemAddon(int id, int newMenuItemId, String addOnName, Number addtionalCost){
        this.id = id;
        this.menuItemId = newMenuItemId;
        this.addOnName = addOnName;
        this.addtionalCost = new BigDecimal(addtionalCost.toString());
    }
}
