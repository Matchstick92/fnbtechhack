package com.fnbtechhack.foodups;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by jason on 9/5/2017.
 */

public class MenuItemOptions {
    public int id;
    public int itemId;
    public Option[] options = {
            new Option(1,1,"small", 0.00),
            new Option(2,1,"medium", 3.00),
            new Option(3,1,"large", 5.00)
    };
    public AddOn[] addOns= {
            new AddOn(1,1,"Cheese", 0.00),
            new AddOn(2,1,"Mushrooms", 3.00),
            new AddOn(3,1,"Pineapple", 5.00)
    };

    public MenuItemOptions(int newId, int newItemId)
    {
        id = newId;
        itemId = newItemId;

    }
}
