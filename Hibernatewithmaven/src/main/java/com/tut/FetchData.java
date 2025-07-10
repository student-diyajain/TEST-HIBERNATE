package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchData {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        
        //no need to begin the transaction
        //get() method -return null if object not found
        Student s1=session.get(Student.class, 101);
                 //OR
        Student s2=(Student)session.get("com.tut.Student", 105);
        System.out.println(s1);
        System.out.println(s2);
        
       //load() method -throws ObjectNotFoundException if object not found
        Student s3=session.load(Student.class, 103);
                 //OR
        Student s4=(Student)session.load("com.tut.Student", 104);
        System.out.println(s3);
        System.out.println(s4);
  
        session.close();
        factory.close();
    }

}
