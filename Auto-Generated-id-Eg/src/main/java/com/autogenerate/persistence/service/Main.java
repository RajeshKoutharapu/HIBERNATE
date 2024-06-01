package com.autogenerate.persistence.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.autogenerate.persistence.employe;

public class Main {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure();
	config.addAnnotatedClass(employe.class);
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction  trans=session.beginTransaction();
	employe obj=new employe("rajesh","developer",50000);
       session.persist(obj);
       trans.commit();
       session.close();
}
}
