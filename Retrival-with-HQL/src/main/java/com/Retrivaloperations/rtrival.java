package com.Retrivaloperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import jakarta.persistence.Query;

public class rtrival {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		SessionFactory seeFactory =config.buildSessionFactory();
		Session session=seeFactory.openSession();
		Query query=session.createQuery("FROM Student WHERE marks>=:limit",Student.class);
		query.setParameter("limit",50);
	  List<Student> list=query.getResultList();
	 for (Student entityClass : list) {
		System.out.println(entityClass);
	}
		
	}

}
