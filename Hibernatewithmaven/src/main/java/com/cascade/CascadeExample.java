package com.cascade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;



public class CascadeExample {

	public static void main(String[] args) {
		SessionFactory Factory =new Configuration().configure().buildSessionFactory();
        //create Question-
        Question q1=new Question();
        q1.setQuestion_id(1033);
        q1.setQuestion("what is java?");
        
        
        //create Answers-
        Answer a1=new Answer();
        Answer a2=new Answer();
        Answer a3=new Answer();
        a1.setAnswer_id(11);
        a1.setAnswer("it is a programming language ");
        a1.setQuestion(q1);
        
        a2.setAnswer_id(12);
        a2.setAnswer("it is platform dependent");
        a2.setQuestion(q1);
        
        a3.setAnswer_id(13);
        a3.setAnswer("used in dsa");
        a3.setQuestion(q1);
        
        List<Answer> answer=new ArrayList<Answer>();
        answer.add(a1);
        answer.add(a2);
        answer.add(a3);
        q1.setAnswer(answer);

       Session session= Factory.openSession();
         Transaction tx= session.beginTransaction();
         
         //save questions with answer id-
         session.save(q1);
         //no need to do manually as we use cascading--
//         session.save(a1);
//         session.save(a2);
//         session.save(a3);
       
        tx.commit();
        session.close();
        Factory.close();

	}

}
