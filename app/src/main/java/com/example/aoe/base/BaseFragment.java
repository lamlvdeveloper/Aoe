package com.example.aoe.base;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.aoe.view.activity.main.MainActivity;

public class BaseFragment extends Fragment {

    public MainActivity activity;

    protected void initViews() {
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity) getActivity();
    }
}
