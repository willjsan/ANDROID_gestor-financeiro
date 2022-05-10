package com.bill.trackbills.ui.fragment.logged;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;
import com.bill.trackbills.ui.adapter.OverviewWrapperAdapter;


public class MainFragment extends Fragment {

    private final String TAG = MainFragment.class.getSimpleName();


    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (Debug.IS_LOGGABLE) Debug.Logger.d(TAG, "onViewCreated");

        ListView lv = view.findViewById(R.id.main_fragment_listview_overview_wrapper);

        OverviewWrapperAdapter overviewWrapperAdapter = new OverviewWrapperAdapter(getContext());
        lv.setAdapter(overviewWrapperAdapter);

    }

    @Override
    public void onPause() {
        if (Debug.IS_LOGGABLE) Debug.Logger.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        if (Debug.IS_LOGGABLE) Debug.Logger.d(TAG, "onDestroyView");
        super.onDestroyView();
    }
}