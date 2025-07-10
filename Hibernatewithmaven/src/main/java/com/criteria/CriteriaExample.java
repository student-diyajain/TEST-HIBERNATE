package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import hql.Example.Person;

public class CriteriaExample {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Person.class);
		
		//add restrictions-
		c.add(Restrictions.gt("id", 5L));   //for Long use L
		c.add(Restrictions.like("gender", "fe%"));   
		
		
		List<Person> list=c.list();
		for(Person person:list) {
			System.out.println(person);
		}	
		session.close();
		factory.close();
	}

}
