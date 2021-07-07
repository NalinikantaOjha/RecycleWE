package com.example.recyclewe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        bulidStudentList();
        setRecyclerView();
    }

    private void bulidStudentList() {
        studentList=new ArrayList<>();
        Student student1 =new Student("Anush",22,"EMP123");
        studentList.add(student1);
        Student student2=new Student("KUNAL",21,"EMP123");
        for (int i =0;i<12;i++){
            Student student = new Student("xyz"+i,21,"EMP123");
            studentList.add(student);
        }
    }private void setRecyclerView(){
        StudentAdapter studentAdapter=new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private  void initViews(){
        recyclerView=findViewById(R.id.recycleView);
    }
}