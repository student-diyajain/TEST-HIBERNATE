package com.map.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SampleDemo {
    public static void main(String[] args) {
        Sample s1=new Sample(1,"diya","f");
        Sample s2=new Sample(2,"rahul","m");
        Sample s3=new Sample(3,"piya","f");
       

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(s3);
        tx.commit();
        Sample s=session.get(Sample.class,1);
        System.out.println(s.getId()+":"+s.getName()+":"+s.getGender());
        session.close();
        factory.close();

    }
}
