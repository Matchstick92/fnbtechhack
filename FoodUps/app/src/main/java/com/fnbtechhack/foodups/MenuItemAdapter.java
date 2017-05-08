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

public class MenuItemAdapter extends ArrayAdapter<MenuItem>
{
    private int mResource;
    public MenuItemAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<MenuItem> items)
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
            name = (TextView) view.findViewById(R.id.restaurant_name_textview);
            price = (TextView) view.findViewById(R.id.restaurant_menu_item_pricing);
        }
    }

    @Override
    public View getView(int position, View convert, ViewGroup parent)
    {
        MenuItem item = getItem(position);

        RestaurantItemAdapter.ViewHolder view;
        if(convert == null)
        {
            convert = LayoutInflater.from(getContext()).inflate(mResource, parent, false);
            view = new RestaurantItemAdapter.ViewHolder(convert);
            convert.setTag(view);
        }
        else
        {
            view = (RestaurantItemAdapter.ViewHolder) convert.getTag();
        }

        view.name.setText(item.name);

        return convert;
    }
}
