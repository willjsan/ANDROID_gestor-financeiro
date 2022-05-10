package com.bill.trackbills.ui.fragment.unlogged;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;


public class RegisterFragment extends Fragment {

    private final String TAG = RegisterFragment.class.getSimpleName();

    public RegisterFragment() {
        super(R.layout.fragment_register);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onRegisterButtonClicked(view);
    }

    private void onRegisterButtonClicked(@NonNull View view) {

        if (Debug.IS_LOGGABLE) {
            Log.d(TAG, "onRegisterButtonClicked");
        }

        Button registerBt = view.findViewById(R.id.bt_reg_confirm);

        registerBt.setOnClickListener(view2 -> {

            if (false) {

                //check if user exists on db
                //save user
                //add some animation
                hideFragment();

            } else {
                Toast.makeText(view.getContext(), "Dados inválidos",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void hideFragment() {

        if (Debug.IS_LOGGABLE) {
            Log.d(TAG, "onHideFragment");
        }
        getParentFragmentManager().popBackStack();
    }

    @Override
    public void onDestroyView() {
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onDestroyView");
        }
        super.onDestroyView();
    }

}