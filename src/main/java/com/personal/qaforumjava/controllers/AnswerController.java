package com.personal.qaforumjava.controllers;

import com.personal.qaforumjava.models.Answer;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions/{questionId}/answers")
class AnswerController {

    @GetMapping
    public static List<Answer> getAllAnswers(@PathVariable Long questionId) {
        return null;
    }
}
