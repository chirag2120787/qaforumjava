package com.personal.qaforumjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Votes")
public class Vote {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long user_id;
    private Long question_id;
    private Long answer_id;
    private Long value;
}
