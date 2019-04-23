package com.test.snackerlibrary;

import android.content.Context;
import android.widget.Toast;

public class SnackerUtil
{
    public static void displaySnackBarMessage(String s, Context context)
    {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }
}
