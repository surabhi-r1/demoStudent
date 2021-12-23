package com.example.demoStudent.Repository;

import com.example.demoStudent.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,String> {
    static void add(StudentEntity s) {
    }
}
