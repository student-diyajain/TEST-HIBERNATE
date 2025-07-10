package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

import hql.Example.Person;

public class SQLExample {

	public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        String query="select * from Person";
        NativeQuery q=session.createSQLQuery(query);
        //q.setParameter(1,"Eva Davis");      //as hibernate need Long not Integer so pass 1L
       
        //unique result-
      // Student s= (Student) q.getSingleResult();
        //multiple result-
      
        List<Object[]>list=q.getResultList();  //since it gives mixture of both question and answer 
        for(Object[] l:list) {
        System.out.print(l[3]+" : ");
        System.out.println(l[2]);
        }
       
        session.close();
        factory.close();

	}

}
