package com.kawishika.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    private String id;
    private String name;
    /*@OneToOne
    private Laptop laptop; // One To One Relationship*/
    @OneToMany(mappedBy = "student")
    private List<Watch> watches;

    public Student(String s002, String juyt) {
        this.id = s002;
        this.name = juyt;
    }
}
