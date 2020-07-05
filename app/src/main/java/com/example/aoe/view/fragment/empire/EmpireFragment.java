package com.example.aoe.view.fragment.empire;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.aoe.R;
import com.example.aoe.adapter.EmpireAdapter;
import com.example.aoe.base.BaseFragment;
import com.example.aoe.database.EmpireData;
import com.example.aoe.databinding.FragmentEmpireBinding;

public class EmpireFragment extends BaseFragment {
    private FragmentEmpireBinding binding;
    private static EmpireFragment instance;
    private EmpireAdapter empireAdapter;

    public static EmpireFragment getInstance() {
        if (instance == null) {
            instance = new EmpireFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_empire, container, false);
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
        empireAdapter = new EmpireAdapter(activity, EmpireData.data());
        binding.recyclerEmpire.setAdapter(empireAdapter);
    }
}