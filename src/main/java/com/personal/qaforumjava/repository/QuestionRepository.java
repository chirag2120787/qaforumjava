package com.personal.qaforumjava.repository;

import com.personal.qaforumjava.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> { }
