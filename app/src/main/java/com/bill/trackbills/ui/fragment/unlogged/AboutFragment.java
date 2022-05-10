package com.bill.trackbills.ui.fragment.unlogged;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;
import com.bill.trackbills.ui.activity.LoggedActivityWrapper;

public class AboutFragment extends Fragment {

    private static final String TAG = AboutFragment.class.getSimpleName();

    public AboutFragment() {
        super(R.layout.fragment_about);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onViewCreated");
        }


        TextView tv = view.findViewById(R.id.tv_about_status);

        tv.setOnClickListener(view1 -> {
            Intent i = new Intent(getContext(), LoggedActivityWrapper.class);
            startActivity(i);
        });
    }

    @Override
    public void onDestroyView() {
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onDestroyView");
        }
        super.onDestroyView();
    }
}