package com.fnbtechhack.foodups.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

public class ContractFoodUps
{

    // The "Content authority" is a name for the entire content provider, similar to the
    // relationship between a domain name and its website.  A convenient string to use for the
    // content authority is the package name for the app, which is guaranteed to be unique on the
    // device.
    public static final String CONTENT_AUTHORITY = "com.fnbtechhack.foodups";

    // Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
    // the content provider.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Possible paths (appended to base content URI for possible URI's)
    // For instance, content://com.example.android.sunshine.app/weather/ is a valid path for
    // looking at weather data. content://com.example.android.sunshine.app/givemeroot/ will fail,
    // as the ContentProvider hasn't been given any information on what to do with "givemeroot".
    // At least, let's hope not.  Don't be that dev, reader.  Don't be that dev.
    public static final String PATH_ORDER = "order";
    public static final String PATH_RESTAURANT = "restaurant";
    public static final String PATH_MENU = "menu";

    public static final class OrderEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "orders";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ORDER).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ORDER;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ORDER;

        public static Uri buildLocationUri(long id)
        {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }

    public static final class RestaurantEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "restaurants";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RESTAURANT).build();

        public static final String COLUMN_RESTAURANT_KEY = "restaurant_id";
        public static final String COLUMN_RESTAURANT_NAME = "restaurant_name";
        public static final String COLUMN_RESTAURANT_OPENING = "restaurant_opening";
        public static final String COLUMN_RESTAURANT_CLOSING = "restaurant_closing";
        public static final String COLUMN_CUISINE = "cuisine_id";
        public static final String COLUMN_COORD_LAT = "restaurant_coord_lat";
        public static final String COLUMN_COORD_LONG = "restaurant_coord_long";

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RESTAURANT;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RESTAURANT;

        public static Uri buildLocationUri(long id)
        {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }

    public static final class MenuEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "menu";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ORDER).build();

        // menu will be updated through FCM.
        public static final String COLUMN_MENU_KEY = "menu_id";
        public static final String COLUMN_MENU_ITEM = "menu_item";
        public static final String COLUMN_MENU_PRICE = "menu_price";
        public static final String COLUMN_CATEGORY_ID = "category_id";

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MENU;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MENU;

        public static Uri buildLocationUri(long id)
        {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }

    public static final class CartEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "cart";

        // menu will be updated through FCM.
        public static final String COLUMN_CART_KEY = "cart_id";
        public static final String COLUMN_CART_MENU_KEY= "menu_id";
        public static final String COLUMN_CART_OPTION_KEY= "option_id";
        public static final String COLUMN_CART_PRICE = "menu_price";
    }
}
