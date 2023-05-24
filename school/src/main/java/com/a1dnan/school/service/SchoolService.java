package com.a1dnan.school.service;

import com.a1dnan.school.client.StudentClient;
import com.a1dnan.school.entities.FullSchoolResponse;
import com.a1dnan.school.entities.School;
import com.a1dnan.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private StudentClient client;

    public void saveSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findAllSchoolStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(School.builder()
                        .email("NOT_FOUND")
                        .name("NOT_FOUND")
                        .build());
        //To Establish communication between the two micro services
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
