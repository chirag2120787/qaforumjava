package com.personal.qaforumjava.repository;

import com.personal.qaforumjava.models.QuestionTag;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTagRepository extends JpaRepository<QuestionTag, Long> {
    List<QuestionTag> findByQuestionId(Long questionId);
}
