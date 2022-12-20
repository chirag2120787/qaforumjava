package com.personal.qaforumjava.service;

import com.personal.qaforumjava.models.Question;
import com.personal.qaforumjava.models.User;
import com.personal.qaforumjava.repository.QuestionRepository;
import com.personal.qaforumjava.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final TagService tagService;

    public Question createQuestion(Question question) {
        Question createdQuestion = questionRepository.save(question);
        if(question.getTags().size() > 0) {
            tagService.handleQuestionTags(createdQuestion.getId(), question.getTags());
        }
    }
}
