package com.example.demoStudent.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity



public class StudentEntity {
    @Id
private String id;
private int regno;
private String name;
private String address;

    public StudentEntity(String id, int regno, String name, String address) {

        this.id = id;
        this.regno = regno;
        this.name = name;
        this.address = address;
    }

    public StudentEntity(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public int getRegno() {
        return regno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }




}
