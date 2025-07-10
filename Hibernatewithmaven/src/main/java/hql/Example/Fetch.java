package hql.Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class Fetch {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        String query="from Person ";
        Query q=session.createQuery(query);
        //multiple result-
        List<Person>list=q.getResultList();
        for(Person person:list) {
    	   System.out.println(person);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        
        String query1="from Person where  id=?1";
        Query q1=session.createQuery(query1);
        q1.setParameter(1,9L);   //as hibernate need Long not Integer so pass 1L
        //unique result-
        Person person1= (Person)q1.getSingleResult(); 
        System.out.println(person1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
       
        String query2="from Person where gender=:x";
        Query q2=session.createQuery(query2);
        q2.setParameter("x", "Female");
      //multiple result-
        List<Person>list2=q2.getResultList();
        for(Person person2:list2) {
    	   System.out.println(person2);
        }
        
        
        session.close();
        factory.close();
    }
}
