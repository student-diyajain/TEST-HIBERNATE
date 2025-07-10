package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Question {
@Id	
int question_id;
String question;
//one question has many answer
@OneToMany(mappedBy = "question",fetch = FetchType.EAGER,cascade = CascadeType.ALL)     //fetch = FetchType.EAGER bina answer get select query run hojayegi
List<Answer> answer;   //it stores pk of answer table as a fk

public Question() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Answer> getAnswer() {
	return answer;
}

public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}

public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}



}
