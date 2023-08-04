package com.kawishika.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.internal.build.AllowPrintStacktrace;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CRoom {
    @Id
    private String cId;
    private String cName;
    @OneToMany(mappedBy = "cRoom",fetch = FetchType.EAGER)
    private List<Student> students;
}
