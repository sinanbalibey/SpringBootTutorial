package com.RestFullWebService.RestFull.rest;


import com.RestFullWebService.RestFull.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private  List<Student> theStudents;

    @PostConstruct
    public void loadData(){

        theStudents=new ArrayList<>();

        theStudents.add(new Student("Sinan","Balibey"));
        theStudents.add(new Student("Ahmet","Karakoç"));
        theStudents.add(new Student("Tüpçü","Fikret"));
    }
    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){


        if((studentId>=theStudents.size()) || (studentId<0) ){
           throw  new StudentNotFoundException("Bu id'ye ait öğrenci bulunmamaktadır - "+studentId);
        }
        return theStudents.get(studentId);
    }



}













