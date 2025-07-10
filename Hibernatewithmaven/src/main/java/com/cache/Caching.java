package com.cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.tut.Student;

public class Caching {

	public static void main(String[] args) {
	   	System.out.println("Program start");
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     
        Session session=factory.openSession();
        Student s1=session.get(Student.class, 101);
        System.out.println(s1);
        Student s2=session.get(Student.class, 101);
        System.out.println(s2);
        System.out.println(session.contains(s1));
      
        session.close();
        
        
        Session session2=factory.openSession();
        Student s3=session2.get(Student.class, 101);
        System.out.println(s3);
        session2.close();
        factory.close();
        System.out.println("Program end");
        

	}

}
