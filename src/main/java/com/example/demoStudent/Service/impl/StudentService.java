package com.example.demoStudent.Service.impl;

import com.example.demoStudent.Repository.StudentRepository;
import com.example.demoStudent.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService implements com.example.demoStudent.Service.StudentServiceParent
{
    @Autowired
    private StudentRepository studentRepository;
    public StudentService() {this.studentRepository= studentRepository;}




    public List<StudentEntity> getAllDetails() {
        //return details;
        List<StudentEntity> details = new ArrayList<>();
        studentRepository.findAll().forEach(details::add);
        return details;

    }





    public StudentEntity getInfo(String id) {
        return studentRepository.findById(id).orElse(null);


    }

    public void addDetails(StudentEntity entity) {
        studentRepository.save(entity);

    }


    public void updateDetails(String id, StudentEntity entity) {
        studentRepository.save(entity);

        }


    public void deleteDetails(String id) {
      studentRepository.deleteById(id);
    }
}


