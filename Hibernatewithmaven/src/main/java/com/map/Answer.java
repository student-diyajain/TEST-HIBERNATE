package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Answer {
	@Id
	int answer_id;
	String answer;
	
	@ManyToOne     //many answer has one question
	Question question; //yeh question table ki pk as a fk dega
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
    public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}


}
