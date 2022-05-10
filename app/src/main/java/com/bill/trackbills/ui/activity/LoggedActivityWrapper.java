package com.bill.trackbills.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;

public class LoggedActivityWrapper extends AppCompatActivity {

    private final String TAG = LoggedActivityWrapper.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_wrapper);

        if(Debug.IS_LOGGABLE){
            Debug.Logger.d(TAG, "onCreate");
        }
    }
}