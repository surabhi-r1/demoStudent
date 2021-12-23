package com.example.demoStudent.Service;

import com.example.demoStudent.entity.StudentEntity;

import java.util.List;

public interface StudentServiceParent {

    void deleteDetails(String id);
    void updateDetails(String id, StudentEntity entity);
    void addDetails(StudentEntity entity);
    StudentEntity getInfo(String id);
}
