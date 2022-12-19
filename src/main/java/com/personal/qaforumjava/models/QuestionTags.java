package com.personal.qaforumjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class QuestionTags {
    @Id
    private Long question_id;
    @Id
    private Long tag_id;
}
