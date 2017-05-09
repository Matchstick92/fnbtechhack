package com.fnbtechhack.foodups;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuItemOptionAdapter extends ArrayAdapter<MenuItemOption>
{
    private int mResource;
    public int selectedPosition;
    public MenuItemOptionAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<MenuItemOption> items)
    {
        super(context, resource, items);
        mResource = resource;
    }

    public static class ViewHolder
    {
        public final TextView name;
        public final TextView price;
        public final RadioButton radio;

        public ViewHolder(View view)
        {
            name = (TextView) view.findViewById(R.id.menu_item_option_name);
            price = (TextView) view.findViewById(R.id.menu_item_option_price);
            radio = (RadioButton) view.findViewById(R.id.radioButton);
        }
    }

    @Override
    public View getView(int position, View convert, ViewGroup parent)
    {
        MenuItemOption item = getItem(position);

        MenuItemOptionAdapter.ViewHolder view;
        if(convert == null)
        {
            convert = LayoutInflater.from(getContext()).inflate(mResource, parent, false);
            view = new MenuItemOptionAdapter.ViewHolder(convert);
            convert.setTag(view);
        }
        else
        {
            view = (MenuItemOptionAdapter.ViewHolder) convert.getTag();
        }

        view.name.setText(item.optionName);
        view.price.setText(getContext().getString(R.string.item_additional_cost, item.addtionalCost));

        view.radio.setChecked(position == selectedPosition);
        view.radio.setTag(position);
        view.radio.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                selectedPosition = (Integer) view.getTag();

                notifyDataSetChanged();
            }
        });

        return convert;
    }
}
