package com.bill.trackbills;

import android.util.Log;

public class Debug {
    public static final boolean IS_LOGGABLE = true;
    private static final String TAG = "mentoria";

    public static class Logger {

        public static void d(String subtag, String msg) {
            Log.d(TAG, getLog(subtag, msg));
        }

        private static String getLog(String subtag, String msg) {
            return "[" + subtag + "] " + msg;
        }
    }
}
