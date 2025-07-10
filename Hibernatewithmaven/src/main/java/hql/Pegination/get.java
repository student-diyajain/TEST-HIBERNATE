package hql.Pegination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hql.Example.Person;

import javax.persistence.Query;
import java.util.List;

public class get {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session s= factory.openSession();
        String query="from Person ";

        Query q=s.createQuery(query);
        //initial state
        q.setFirstResult(2); //start from 0
        //total result
        q.setMaxResults(5);
        List<Person> List=q.getResultList();
        System.out.println(List);
        s.close();
    }
}
