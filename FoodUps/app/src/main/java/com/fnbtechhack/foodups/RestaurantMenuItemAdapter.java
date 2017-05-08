package com.fnbtechhack.foodups;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantMenuItemAdapter extends ArrayAdapter<MenuItem>
{
    /*****************************************
     * Reuses menu item class
     *****************************************
     */
    private int mResource;
    public RestaurantMenuItemAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<MenuItem> items)
    {
        super(context, resource, items);
        mResource = resource;
    }

    public static class ViewHolder
    {
        public final TextView name;
        public final TextView price;

        public ViewHolder(View view)
        {
            name = (TextView) view.findViewById(R.id.restaurant_menu_item_name);
            price = (TextView) view.findViewById(R.id.restaurant_menu_item_pricing);
        }
    }

    @Override
    public View getView(int position, View convert, ViewGroup parent)
    {
        MenuItem item = getItem(position);

        RestaurantMenuItemAdapter.ViewHolder view;
        if(convert == null)
        {
            convert = LayoutInflater.from(getContext()).inflate(mResource, parent, false);
            view = new RestaurantMenuItemAdapter.ViewHolder(convert);
            convert.setTag(view);
        }
        else
        {
            view = (RestaurantMenuItemAdapter.ViewHolder) convert.getTag();
        }

        view.name.setText(item.name);
        view.price.setText(getContext().getString(R.string.menu_item_price, item.price));

        return convert;
    }
}
