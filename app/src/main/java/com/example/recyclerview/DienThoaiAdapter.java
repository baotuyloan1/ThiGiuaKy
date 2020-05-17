package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DienThoaiAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<DienThoai> dienThoaiArrayList;
    Context context;

    public DienThoaiAdapter(ArrayList<DienThoai> dienThoaiArrayList, Context context) {
        this.dienThoaiArrayList = dienThoaiArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(dienThoaiArrayList.get(position).getName());
        holder.imgHinh.setImageResource(dienThoaiArrayList.get(position).getImgHinh());

    }

    @Override
    public int getItemCount() {
        return dienThoaiArrayList.size();
    }
}
