package com.bill.trackbills;


import android.app.Application;


public class TrackBillsApplication extends Application {
    private static final String TAG = TrackBillsApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onCreate");
        }
    }
}
