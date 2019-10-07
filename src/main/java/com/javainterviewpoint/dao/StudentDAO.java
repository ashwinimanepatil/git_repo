package com.javainterviewpoint.dao;

import java.util.List;

import com.javainterviewpoint.model.Student;

public interface StudentDAO
{
    public void createStudent(Student student);
    
    public Student getStudentById(long productId);
    public List<Student> getAllStudents();
    
    public void updateStudent(Student student);
    
    public void deleteStudent(long productId);
}
