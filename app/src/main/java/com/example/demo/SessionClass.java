package com.example.demo;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionClass {


   public static SharedPreferences pref;

   public static SharedPreferences.Editor editor;
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "AndroidHiveLogin";

    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";
    private static final String USER = "login";

    public SessionClass(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public static void setUser(String name){
        editor.putString("name",name);
    }

    public static String getUser(){
        return pref.getString(USER, "");
    }
}
