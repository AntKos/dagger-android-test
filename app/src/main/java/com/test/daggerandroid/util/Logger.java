package com.test.daggerandroid.util;

import android.util.Log;

public class Logger {
    private static final String TAG = Logger.class.getSimpleName();
    public static void log(String msg) {
        Log.d(TAG, msg);
    }
}
