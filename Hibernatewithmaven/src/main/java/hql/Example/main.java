package hql.Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
                Person s1=new Person("Alice Johnson", "alice.johnson@example.com", "Female");
                Person s2=new Person("Bob Smith", "bob.smith@example.com", "Male");
                Person s3=new Person("Carol Williams", "carol.williams@example.com", "Female");
                Person s4=new Person("David Brown", "david.brown@example.com", "Male");
                Person s5=new Person("Eva Davis", "eva.davis@example.com", "Female");
                Person s6=new Person("Frank Miller", "frank.miller@example.com", "Male");
                Person s7=new Person("Grace Wilson", "grace.wilson@example.com", "Female");
                Person s8=new Person("Henry Moore", "henry.moore@example.com", "Male");
                Person s9=new Person("Ivy Taylor", "ivy.taylor@example.com", "Female");
                Person s10=new Person("Jack Anderson", "jack.anderson@example.com", "Male");
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session s= factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(s1);
        s.save(s2);
        s.save(s3);
        s.save(s4);
        s.save(s5);
        s.save(s6);
        s.save(s7);
        s.save(s8);
        s.save(s9);
        s.save(s10);
        tx.commit();
        s.close();
        factory.close();
        System.out.println("end........");
    }
}
