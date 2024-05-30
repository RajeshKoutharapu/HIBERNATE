package com.noXlm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAPP {
public static void main(String[] args) {
Configuration config=new Configuration();
config.addAnnotatedClass(students.class);
SessionFactory sessionFactory=config.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tran=session.beginTransaction();
      students students= session.getReference(students.class,3);
      System.out.println(students.getSid());
      System.out.println(students.getCity()+" "+students.getName()+" "+students.getSid()+" "+students.getMarks());
      
}
}
