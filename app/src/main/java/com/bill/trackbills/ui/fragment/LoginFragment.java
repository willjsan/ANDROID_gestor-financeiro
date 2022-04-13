package com.bill.trackbills.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;

public class LoginFragment extends Fragment {

    private final String TAG = LoginFragment.class.getSimpleName();

    public LoginFragment() {
        super(R.layout.fragment_login);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onViewCreated");
        }
        seClickLoginButtonListener(view);
    }

    private void seClickLoginButtonListener(View view) {

        view.findViewById(R.id.bt_login_login).setOnClickListener(fragmentView -> {
            if (Debug.IS_LOGGABLE) {
                Debug.Logger.d(TAG, "onLoginButtonClicked");
            }

            if (false) {
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
            Debug.Logger.d(TAG, "onHideFragment");
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