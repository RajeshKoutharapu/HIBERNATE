package com.operation.main;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.operation.persistince.students;

import jakarta.transaction.Transaction;

public class Main {
	public static void main(String[] args) {
   Configuration cofig=new Configuration();
    cofig.configure();
    org.hibernate.SessionFactory sessionfactory=cofig.buildSessionFactory();
    org.hibernate.Session session =sessionfactory.openSession();
    org.hibernate.Transaction trans=session.beginTransaction();
  students obj=new students(1,"raj","ongole",25);
  students obj1=new students(2,"mahi","HYD",45);
  students obj2=new students(3,"kiran","guntur",65);
  students obj3=new students(4,"deepika","heaven",100);
  students obj4=new students(5,"geethika","bapatla",55);
  students obj5=new students(6,"bhavya","gudur",95);
  session.save(obj);
  session.save(obj1);
  session.save(obj2);  
  session.save(obj3);
  session.save(obj4);
  session.save(obj5);
  
  trans.commit();
  session.close();
    
    
	}

}
