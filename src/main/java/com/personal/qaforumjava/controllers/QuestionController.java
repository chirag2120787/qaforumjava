package com.personal.qaforumjava.controllers;

import com.personal.qaforumjava.models.Question;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
class QuestionController {

    @GetMapping
    public List<Question> getAllQuestions() {
        return null;
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return null;
    }

    @PutMapping("/{id}")
    public Question updateQuestion(@PathVariable Long id, @RequestBody Question questionDetails) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteQUestion(@PathVariable Long id) {}
}