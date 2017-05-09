package com.fnbtechhack.foodups;

public class RestaurantItem
{
    public int id;
    public String name;
    public int image;
    public String cuisine;
    public String location;

    public RestaurantItem(int newId, String newName, int newImage, String newCuisine, String newLocation)
    {
        id = newId;
        name = newName;
        image = newImage;
        cuisine = newCuisine;
        location = newLocation;
    }
}
