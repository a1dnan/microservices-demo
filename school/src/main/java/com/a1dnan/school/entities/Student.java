package com.a1dnan.school.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String firstname;
    private String lastname;
    private String email;
}
