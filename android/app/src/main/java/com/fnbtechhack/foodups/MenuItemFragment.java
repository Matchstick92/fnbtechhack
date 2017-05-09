package com.fnbtechhack.foodups;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.fnbtechhack.foodups.data.MockMenuItemAddons;
import com.fnbtechhack.foodups.data.MockMenuItemOptions;
import com.fnbtechhack.foodups.data.MockRestaurantMenu;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MenuItemFragment extends Fragment
{
    private static final String LOG_TAG = MenuItemFragment.class.getSimpleName();
    private View mView;
    private BigDecimal mCartPrice;
    private BigDecimal mOptionPrice;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_menu_item, container, false);
        int menuItemId = getArguments().getInt("id");
        Log.v(LOG_TAG, "Menu ID is " + menuItemId + ".");

        // list of dummy data
        MockRestaurantMenu menuItem = new MockRestaurantMenu();
        MockMenuItemOptions itemOptions = new MockMenuItemOptions();
        MockMenuItemAddons itemAddons = new MockMenuItemAddons();

        final MenuItem menuItemInfo = menuItem.findMenuItemById(menuItemId);

        ListView optionsList = (ListView) view.findViewById(R.id.menu_item_options);
        ListView addonsList = (ListView) view.findViewById(R.id.menu_item_addons);
        ArrayList<MenuItemOption> itemOptionsList = itemOptions.findMenuItemByMenuId(menuItemId);
        ArrayList<MenuItemAddon> itemAddonsList = itemAddons.findMenuItemByMenuId(menuItemId);

        optionsList.setAdapter(new MenuItemOptionAdapter(getActivity(), R.layout.menu_item_option, itemOptionsList));
        addonsList.setAdapter(new MenuItemAddonAdapter(getActivity(), R.layout.menu_item_addon, itemAddonsList));

        // set names and stuff
        ImageView image = (ImageView) view.findViewById(R.id.menu_item_image);
        image.setImageResource(menuItemInfo.image);

        TextView name = (TextView) view.findViewById(R.id.menu_item_name);
        name.setText(menuItemInfo.name);

        TextView price = (TextView) view.findViewById(R.id.menu_item_price);
        price.setText(getContext().getString(R.string.item_price, menuItemInfo.price));

        TextView button = (TextView) view.findViewById(R.id.add_to_cart);
        button.setText(getContext().getString(R.string.default_add_button, menuItemInfo.price));
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        mCartPrice = menuItemInfo.price;
        mView = view;
        return view;
    }

    public void updateAddPrice()
    {
        BigDecimal price = mCartPrice;
        price = price.add(mOptionPrice);

        TextView button = (TextView) mView.findViewById(R.id.add_to_cart);
        button.setText(getContext().getString(R.string.default_add_button, price));
    }
}
