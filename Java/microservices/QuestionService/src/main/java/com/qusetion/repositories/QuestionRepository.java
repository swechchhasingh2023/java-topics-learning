package com.qusetion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qusetion.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
	List<Question> findByQuizId(Long quizId);
}
