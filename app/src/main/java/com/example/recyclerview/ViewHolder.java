package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView txtName;
    public ImageView imgHinh;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = (TextView)itemView.findViewById(R.id.txtName);
        imgHinh = (ImageView)itemView.findViewById(R.id.imgHinh);
    }
}
