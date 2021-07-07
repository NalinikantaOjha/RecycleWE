package com.example.recyclewe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private  TextView mTvAge;
    private  TextView maTvRollNo;

    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        iniViwes(itemView);
    }

    private void iniViwes(View itemView) {
        mTvName=itemView.findViewById(R.id.tvName);
        maTvRollNo=itemView.findViewById(R.id.tvRollNo);
        mTvAge=itemView.findViewById(R.id.tvAge);
    }
    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        maTvRollNo.setText(student.getRollNo());
    }
}
