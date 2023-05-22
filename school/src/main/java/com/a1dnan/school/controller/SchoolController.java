package com.a1dnan.school.controller;

import com.a1dnan.school.entities.School;
import com.a1dnan.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllStudents(){
        return ResponseEntity.ok(service.findAllSchools());
    }
}
