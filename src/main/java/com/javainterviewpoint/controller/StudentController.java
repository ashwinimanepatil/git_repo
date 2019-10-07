package com.javainterviewpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainterviewpoint.dao.StudentDAOImpl;
import com.javainterviewpoint.model.Student;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController
{
    @Autowired
    private StudentDAOImpl studentDAOImpl;
    
    /*** Creating a new Student ***/
    @RequestMapping(value="/create", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createStudent(@RequestBody Student student)
    {
        studentDAOImpl.createStudent(student);
    }
    
    /*** Retrieve a single Student ***/
    @RequestMapping(value="/products/{id}",produces="application/json",
            method=RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") long productId)
    {
        Student student = studentDAOImpl.getStudentById(productId);
        return student;
    }
    
    /*** Retrieve all Students ***/
    @RequestMapping(value="/products",produces="application/json",
            method=RequestMethod.GET)
    public List getAllStudents()
    {
        List studentList = studentDAOImpl.getAllStudents();
        return studentList;
    }
    
    /*** Update a Student ***/
    @RequestMapping(value="/update", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateStudent(@RequestBody Student student)
    {
        studentDAOImpl.updateStudent(student);
    }
    
    /*** Delete a Student ***/
    @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE,
             produces="application/json")
    public void deleteStudent(@PathVariable("id") long productId)
    {
        studentDAOImpl.deleteStudent(productId);
    }
    
    /*@RequestMapping(value="/products/buyProdct",method = RequestMethod.GET,
    		produces="application/json")
    public void (@PathVariable("id") long productId)
    {
        studentDAOImpl.deleteStudent(productId);
    }*/
}
