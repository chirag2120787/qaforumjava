package com.personal.qaforumjava.repository;

import com.personal.qaforumjava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
