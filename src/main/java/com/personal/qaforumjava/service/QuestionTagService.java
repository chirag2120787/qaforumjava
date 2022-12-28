package com.personal.qaforumjava.service;

import com.personal.qaforumjava.models.QuestionTag;
import com.personal.qaforumjava.repository.QuestionTagRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class QuestionTagService {

    private final QuestionTagRepository questionTagRepository;

    public QuestionTag createQuestionTag(Long tagId, Long questionId) {
        QuestionTag questionTag = new QuestionTag();
        questionTag.setQuestionId(questionId);
        questionTag.setTagId(tagId);
        return questionTagRepository.save(questionTag);
    }

    public List<QuestionTag> getByQuestionId(Long questionId) {
        return questionTagRepository.findByQuestionId(questionId);
    }

}
