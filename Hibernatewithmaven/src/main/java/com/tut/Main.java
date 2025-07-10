package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) throws IOException {
    	System.out.println("Program start");
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        
        //Certificate Object-
        Certificate certificate1=new Certificate("dsa","2months");
        Certificate certificate2=new Certificate("spring","8months");
        Certificate certificate3=new Certificate("python","5months");
        //Student Object-
        Student student1=new Student(101,"diya jain","delhi",certificate1);
        Student student2=new Student(102,"riya jain","mumbai",certificate2);
        Student student3=new Student(103,"priya jain","chennai",certificate3);
       
        
        
        //store image
        FileInputStream fileInputStream=new FileInputStream("src\\main\\java\\com\\tut\\hibernate-logo.svg");//it throws FileNotFoundException
        byte[] image=new byte[fileInputStream.available()];//blank array    //it throws IOException
        fileInputStream.read(image);//now array contains image
        
        //Address Object-
        Address address=new Address();
        address.setStreet("eastdelhi");
        address.setCity("delhi");
        address.setOpen(true);
        address.setX(2400.50);
        address.setAddedDate(new Date());
        address.setImage(image);
        
        
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(address);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("Program end");
        
        
        
        
      


    }
}
