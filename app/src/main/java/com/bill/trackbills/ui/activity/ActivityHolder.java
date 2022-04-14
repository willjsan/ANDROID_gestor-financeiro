package com.bill.trackbills.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;

public class ActivityHolder extends AppCompatActivity {

    private final String TAG = ActivityHolder.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);

        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onCreate");
        }
        setActionBarColor();
    }

    /**
     * must change the approach to set the ActionBar color
     */
    private void setActionBarColor() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            if (Debug.IS_LOGGABLE) {
                Debug.Logger.d(TAG, "onActionBarColorChanged");
            }

            actionBar.setBackgroundDrawable(new ColorDrawable(
                    getResources().getColor(R.color.app_blue_dark, getTheme())));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onPause");
        }
    }

    @Override
    protected void onDestroy() {
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onDestroy");
        }
        super.onDestroy();
    }
}