package com.fnbtechhack.foodups;

import java.math.BigDecimal;

/**
 * Created by jason on 9/5/2017.
 */

public class MenuItemOption
{
    public int id;
    public int menuItemId;
    public String optionName;
    public BigDecimal addtionalCost;


    public MenuItemOption(int id, int newMenuId, String optionName, Number addtionalCost){
        this.id = id;
        this.menuItemId = newMenuId;
        this.optionName = optionName;
        this.addtionalCost = new BigDecimal(addtionalCost.toString());
    }
}
