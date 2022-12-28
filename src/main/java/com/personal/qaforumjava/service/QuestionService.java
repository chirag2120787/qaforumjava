package com.personal.qaforumjava.service;

import com.personal.qaforumjava.models.Question;
import com.personal.qaforumjava.models.QuestionTag;
import com.personal.qaforumjava.models.Tag;
import com.personal.qaforumjava.models.User;
import com.personal.qaforumjava.repository.QuestionRepository;
import com.personal.qaforumjava.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionTagService questionTagService;
    private final TagService tagService;

    public Question handleCreateQuestion(Question question) {
        Question createdQuestion = questionRepository.save(question);
        if(question.getTags().size() > 0) {
            tagService.handleQuestionTags(createdQuestion.getId(), question.getTags());
        }
        return createdQuestion;
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }


    public Question getQuestionById(Long id) {
        Question question = questionRepository.getReferenceById(id);
        return populateTags(question);
    }

    public Question populateTags(Question question) {
        List<QuestionTag> questionTags = questionTagService.getByQuestionId(question.getId());
        List<Tag> tags = new ArrayList<Tag>();
        questionTags.forEach(questionTag -> {
            Tag tag = tagService.getTagById(questionTag.getTagId());
            tags.add(tag);
        });
        question.setTags(tags);
        return question;
    }

}
