package com.kawishika.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Subject {
    @Id
    private String id;
    private String name;
    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;
}
