package com.update.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import jakarta.persistence.Query;

public class mainClass {
  public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure();
	config.addAnnotatedClass(entityClass.class);
	SessionFactory sessionFactory=config.buildSessionFactory();

		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		int count=session.createMutationQuery("UPDATE entityClass SET marks=:new WHERE sid=:id").setParameter("new",69).setParameter("id",1).executeUpdate();
		System.out.println(count);
		MutationQuery query=session.createMutationQuery("DELETE  FROM entityClass WHERE name=:dname");
		query.setParameter("dname","geethika");
		int count1=query.executeUpdate();
		System.out.println("deleted rowes :"+count1);
		trans.commit();
		session.close();
	
  }
}
