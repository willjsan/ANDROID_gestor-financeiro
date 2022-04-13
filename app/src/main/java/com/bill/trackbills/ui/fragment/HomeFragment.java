package com.bill.trackbills.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bill.trackbills.Debug;
import com.bill.trackbills.R;


public class HomeFragment extends Fragment {
    private final String TAG = HomeFragment.class.getSimpleName();

    public HomeFragment() {
        super(R.layout.fragment_home);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onViewCreated");
        }

        setClickSignUpButtonListener(view.findViewById(R.id.tv_home_signin));
        setClickLoginButtonListener(view.findViewById(R.id.bt_home_login));
    }

    private void setClickLoginButtonListener(Button bt_login) {
        bt_login.setOnClickListener(fragmentView -> {

            if (Debug.IS_LOGGABLE) {
                Debug.Logger.d(TAG, "onLoginClicked");
            }
            inflateFragment(new LoginFragment());
        });
    }

    private void setClickSignUpButtonListener(TextView tv_signUp) {
        tv_signUp.setOnClickListener(fragmentView -> {

            if (Debug.IS_LOGGABLE) {
                Debug.Logger.d(TAG, "onSignUpClicked");
            }
            inflateFragment(new RegisterFragment());
        });
    }

    private void inflateFragment(Fragment fragment) {

        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onInflateFragment");
        }

        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentcontainerview_wrapper, fragment)
                .addToBackStack(null).commit();
    }

    @Override
    public void onDestroyView() {
        if (Debug.IS_LOGGABLE) {
            Debug.Logger.d(TAG, "onDestroyView");
        }
        super.onDestroyView();
    }

}