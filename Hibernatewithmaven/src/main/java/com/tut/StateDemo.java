package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        
        //Transient State-create the object and set the values
        Student student=new Student();
        student.setId(224);
        student.setName("john");
        student.setCity("delhi");
        student.setCerti(new Certificate("spring","3months"));
        System.out.println(student);
       
        //Persistent State-object saved in both db and session 
        Transaction tx=session.beginTransaction();
        session.save(student);
        student.setName("john sharma");
        
        //Removed State-saved only in session and removed from db
        session.delete(student);
        tx.commit();
       
      
        //Detached State- (using clear or close) object saved only in db and removed from session
        session.close();
        student.setName("john sharmaji");
        
       
    }


}
