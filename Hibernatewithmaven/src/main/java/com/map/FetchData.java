package com.map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchData {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        
    //get answer using question object-
        Question question=session.get(Question.class, 1011);
        System.out.print(question.getQuestion_id()+":");
        System.out.print(question.getQuestion()+":");
        for(Answer a:question.getAnswer()) {
    	   System.out.println(a.getAnswer());
        }
       
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        //get question using answer object-(in case of bidirectional mapping)
        Answer answer =session.get(Answer.class,1);
        System.out.print(answer.getQuestion().getQuestion()+":");
        Answer answer1 =session.get(Answer.class,2);
        System.out.print(answer1.getQuestion().getQuestion()+":");
        Answer answer2 =session.get(Answer.class,3);
        System.out.print(answer2.getQuestion().getQuestion()+":");
        
        session.close();
        factory.close();
    }

}
