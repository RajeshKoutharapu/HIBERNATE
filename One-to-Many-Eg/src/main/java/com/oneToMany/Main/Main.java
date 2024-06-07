package com.oneToMany.Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oneToMany.persistence.*;

public class Main {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Course.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		// -->code for inserting data
//		Student s1=new Student();
//		Course c1=new Course(1,"java",999,s1);
//		Course c2=new Course(2,"c++",2999,s1);
//		List<Course> list= new ArrayList<Course>();
//		list.add(c1);
//		list.add(c2);
//		s1.setSid(1);
//		s1.setName("rajesh");
//		s1.setCity("ongole");  
//		s1.setCourse(list);
//		session.persist(s1);
//		session.persist(c1);
//		session.persist(c2);
		Student res=session.get(Student.class,1);
		System.out.println(res.getName());
		res.getCourse().forEach(a->System.out.println(a.getCname()));
		trans.commit();
		session.close();
	}

}
