package com.example.aoe.view.fragment.troop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.aoe.R;
import com.example.aoe.base.BaseFragment;
import com.example.aoe.databinding.FragmentTroopBinding;

public class TroopFragment extends BaseFragment {
    private FragmentTroopBinding binding;
    private static TroopFragment instance;

    public static TroopFragment getInstance() {
        if (instance == null) {
            instance = new TroopFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_troop, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    @Override
    protected void initViews() {
        super.initViews();
        binding.txtTroop.setText("Troop Screen");
    }
}