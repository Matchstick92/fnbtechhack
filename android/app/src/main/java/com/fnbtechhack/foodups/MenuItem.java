package com.fnbtechhack.foodups;

import java.math.BigDecimal;

public class MenuItem
{
    public int id;
    public int restaurantId;
    public String name;
    public int image;
    public BigDecimal price;

    public MenuItem(int newId, int newRestaurantId, String newName, int newImage, Number newPrice)
    {
        id = newId;
        restaurantId = newRestaurantId;
        name = newName;
        image = newImage;
        price = new BigDecimal(newPrice.toString());
    }
}
