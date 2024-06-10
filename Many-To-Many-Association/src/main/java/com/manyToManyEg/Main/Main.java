package com.manyToManyEg.Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manyToManyEg.persistence.*;

public class Main {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(Authors.class);
		config.addAnnotatedClass(Books.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Authors a1=new Authors();
		a1.setAid(1);
		a1.setAname("kenfollet");
        Authors a2=new Authors();
        a2.setAid(2);
        a2.setAname("RGV");
      Books bk1=new Books();
      bk1.setId(1);
      bk1.setBookname("code to Zero");
      Books bk2=new Books();
      bk2.setId(2);
      bk2.setBookname("Night over water");
      Books bk3=new Books();
      bk3.setId(3);
      bk3.setBookname("ramuyisam");
      Books bk4=new Books();
     bk4.setId(4);
     bk4.setBookname("ramayanam");
     List<Authors> list=new ArrayList<Authors>();
     list.add(a1);
     list.add(a2);
     bk2.setAuthorslist(list);
     bk3.setAuthorslist(list);
     bk1.setAuthorslist(list);
     bk4.setAuthorslist(list);
     	List<Books> bklist=new ArrayList<>();
		bklist.add(bk1);
		bklist.add(bk2);
		List<Books> bklist2=new ArrayList<Books>();
		bklist2.add(bk3);
		bklist2.add(bk4);
		bklist2.add(bk1);
		a1.setBookslist(bklist);
		a2.setBookslist(bklist2);
		session.persist(a1);
		session.persist(a2);
		session.persist(bk1);
		
		trans.commit();
		session.close();
	}

}
