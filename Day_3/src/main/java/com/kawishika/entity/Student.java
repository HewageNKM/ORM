package com.kawishika.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {
    @Id
    private String sId;
    private String name;
    private String address;
    @ManyToOne
    private CRoom cRoom;
}
