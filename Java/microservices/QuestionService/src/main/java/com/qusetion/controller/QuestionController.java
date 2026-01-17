package com.qusetion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qusetion.entities.Question;
import com.qusetion.services.QuestionService;


@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	//create
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	
	//get ALL
	@GetMapping
	public List<Question> get() {
		return questionService.get();
	}
	
	//get one
		@GetMapping("{questionId}")
		public Question getOne(@PathVariable Long questionId) {
			return questionService.getOne(questionId);
		}
	
		// get all  question of specific quiz
		@GetMapping("/quiz/{quizId}")
		public List<Question> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId){
			return questionService.getQuestionsOfQuiz(quizId);
		}
	
}
