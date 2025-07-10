package com.map.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory Factory =new Configuration().configure().buildSessionFactory();
        //create Emp-
        List<Emp> employee=new ArrayList<Emp>();
        List<Project> project=new ArrayList<Project>();
        Emp e1=new Emp();
        Emp e2=new Emp();
          
       e1.setE_id(1);
       e1.setE_name("Employee1");
       e1.setE_id(2);
       e1.setE_name("Employee2");
       employee.add(e1);
       employee.add(e2);
        
        //create Project-
        Project p1=new Project();
        Project p2=new Project();
        Project p3=new Project();
        p1.setP_id(1);
        p1.setP_name("Project1");
        p2.setP_id(2);
        p2.setP_name("Project2");
        p3.setP_id(3);
        p3.setP_name("Project3");
        project.add(p1);
        project.add(p2);
        project.add(p3);
        
        
        e1.setProject(project);
        p1.setEmp(employee);
        
        
      Session session= Factory.openSession();
         Transaction tx= session.beginTransaction();
         session.save(e1);
         session.save(p1);
       

        tx.commit();
        session.close();
        Factory.close();
 }
}
