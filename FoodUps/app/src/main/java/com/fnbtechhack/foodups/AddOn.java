package com.fnbtechhack.foodups;

import java.math.BigDecimal;

/**
 * Created by jason on 9/5/2017.
 */

public class AddOn {
    public int id;
    public int itemOptionId;
    public String addOnName;
    public BigDecimal addtionalCost;

    public AddOn(int id, int itemOptionId,String addOnName, Number addtionalCost){
        this.id = id;
        this.itemOptionId = itemOptionId;
        this.addOnName = addOnName;
        this.addtionalCost = new BigDecimal(addtionalCost.toString());
    }
}
