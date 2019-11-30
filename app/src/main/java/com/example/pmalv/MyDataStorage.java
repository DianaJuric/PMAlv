package com.example.pmalv;


import java.util.ArrayList;
import java.util.List;

public class MyDataStorage {

    private List<Student> students;
    private MyDataStorage()
    {
        students = new ArrayList<Student>();
    }
    static private MyDataStorage instanca;

    static MyDataStorage getInstance()
    {
        if(instanca==null)
        {
            instanca = new MyDataStorage();
        }
        return  instanca;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
