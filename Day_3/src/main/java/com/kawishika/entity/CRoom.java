package com.kawishika.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.internal.build.AllowPrintStacktrace;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CRoom {
    @Id
    private String cId;
    private String cName;
    @OneToMany(mappedBy = "cRoom",fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    private List<Student> students;
}
