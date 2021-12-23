package com.example.demoStudent.controller;

import com.example.demoStudent.Service.impl.StudentService;
import com.example.demoStudent.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/info")
    public List<StudentEntity> getAllDetails() {
        return studentService.getAllDetails();
    }

    @RequestMapping("/info/{id}")
    public StudentEntity getInfo(@PathVariable String id) {
        return studentService.getInfo(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/info")
    public void addDetails(@RequestBody  StudentEntity entity)
    {
studentService.addDetails(entity);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/info/{id}")
    public void updateDetails(@RequestBody  StudentEntity entity,@PathVariable String id)
    {
        studentService.updateDetails(id,entity);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/info/{id}")
    public void deleteDetails(@PathVariable String id) {
        studentService.deleteDetails(id);
    }
}
