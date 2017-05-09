package com.fnbtechhack.foodups;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuItemAddonAdapter extends ArrayAdapter<MenuItemAddon>
{
    private int mResource;
    public MenuItemAddonAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<MenuItemAddon> items)
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
            name = (TextView) view.findViewById(R.id.menu_item_addon_name);
            price = (TextView) view.findViewById(R.id.menu_item_addon_price);
        }
    }

    @Override
    public View getView(int position, View convert, ViewGroup parent)
    {
        MenuItemAddon item = getItem(position);

        MenuItemAddonAdapter.ViewHolder view;
        if(convert == null)
        {
            convert = LayoutInflater.from(getContext()).inflate(mResource, parent, false);
            view = new MenuItemAddonAdapter.ViewHolder(convert);
            convert.setTag(view);
        }
        else
        {
            view = (MenuItemAddonAdapter.ViewHolder) convert.getTag();
        }

        view.name.setText(item.addOnName);
        view.price.setText(getContext().getString(R.string.item_additional_cost, item.addtionalCost));

        return convert;
    }
}
