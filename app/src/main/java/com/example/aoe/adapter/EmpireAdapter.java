package com.example.aoe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aoe.R;
import com.example.aoe.databinding.ItemEmpireBinding;
import com.example.aoe.model.Empire;

import java.util.List;

public class EmpireAdapter extends RecyclerView.Adapter<EmpireAdapter.ViewHolder> {
    private Context context;
    private List<Empire> empireList;

    public EmpireAdapter(Context context, List<Empire> empireList) {
        this.context = context;
        this.empireList = empireList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemEmpireBinding binding = ItemEmpireBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(empireList.get(position));
    }

    @Override
    public int getItemCount() {
        return empireList != null ? empireList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemEmpireBinding binding;

        public ViewHolder(ItemEmpireBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Empire empire) {
            binding.txtName.setText(empire.getName());
        }
    }
}
