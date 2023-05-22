package com.a1dnan.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
}
