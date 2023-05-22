package com.a1dnan.school.repository;

import com.a1dnan.school.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
