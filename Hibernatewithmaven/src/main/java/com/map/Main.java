package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory Factory =new Configuration().configure().buildSessionFactory();
        //create Question-
        Question q1=new Question();
        q1.setQuestion_id(1011);
        q1.setQuestion("what is oops?");
        
        
        //create Answers-
        Answer a1=new Answer();
        Answer a2=new Answer();
        Answer a3=new Answer();
        a1.setAnswer_id(1);
        a1.setAnswer("object oriented programming");
        a1.setQuestion(q1);
        
        a2.setAnswer_id(2);
        a2.setAnswer("has four characterstics");
        a2.setQuestion(q1);
        
        a3.setAnswer_id(3);
        a3.setAnswer("used in c++,java");
        a3.setQuestion(q1);
        
        List<Answer> answer=new ArrayList<Answer>();
        answer.add(a1);
        answer.add(a2);
        answer.add(a3);
        q1.setAnswer(answer);

       Session session= Factory.openSession();
         Transaction tx= session.beginTransaction();
         //save answers with question id-
         session.save(a1);
         session.save(a2);
         session.save(a3);
         
         //save questions with answer id-
         session.save(q1);

       

        tx.commit();
        session.close();
        Factory.close();
 }
}
