package com.example.aoe.view;

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
import com.example.aoe.databinding.FragmentEmpireBinding;
import com.example.aoe.model.Empire;

import java.util.ArrayList;
import java.util.List;

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
        empireAdapter = new EmpireAdapter(activity, getList());
        binding.recyclerEmpire.setAdapter(empireAdapter);
    }

    private List<Empire> getList() {
        List<Empire> empireList = new ArrayList<>();
        empireList.add(new Empire("1"));
        empireList.add(new Empire("2"));
        empireList.add(new Empire("3"));
        empireList.add(new Empire("4"));
        empireList.add(new Empire("5"));
        empireList.add(new Empire("6"));
        empireList.add(new Empire("7"));
        return empireList;
    }
}