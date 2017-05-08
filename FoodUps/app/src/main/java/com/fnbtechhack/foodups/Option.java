package com.fnbtechhack.foodups;

import java.math.BigDecimal;

/**
 * Created by jason on 9/5/2017.
 */

public class Option {
    public int id;
    public int itemOptionId;
    public String optionName;
    public BigDecimal addtionalCost;


    public Option(int id, int itemOptionId,String optionName, Number addtionalCost){
        this.id = id;
        this.itemOptionId = itemOptionId;
        this.optionName = optionName;
        this.addtionalCost = new BigDecimal(addtionalCost.toString());
    }
}
