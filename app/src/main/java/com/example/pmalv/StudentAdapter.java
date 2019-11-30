package com.example.pmalv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentAdapter extends
        RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Student> dataList;
    public StudentAdapter(List<Student> myDataset) {
        dataList = myDataset;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup
                                                              viewGroup, int viewType) {
        // create a new view
        View view = (View) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.student_holder, viewGroup, false);
        return new StudentViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int
            position) {
        StudentViewHolder studentViewHolder = (StudentViewHolder) viewHolder;
        studentViewHolder.tvName.setText(dataList.get(position).getIme());
        studentViewHolder.tvPrezime.setText(dataList.get(position).getPrezime());
        studentViewHolder.tvPredmet.setText(dataList.get(position).getPredmet());
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvPrezime;
        TextView tvPredmet;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrezime = itemView.findViewById(R.id.tvPrezime);
            tvPredmet = itemView.findViewById(R.id.tvPredmet);
        }
    }
}