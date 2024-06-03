package com.oneToOne.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oneToOne.Main.persistence.account;
import com.oneToOne.Main.persistence.user;

public class Main {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(user.class);
		config.addAnnotatedClass(account.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		account ac1=new account(2,89153598L,"savings");
		user u1=new user(4,"mahesh",8000000L,ac1);
		session.persist(ac1);
		session.persist(u1);
		trans.commit();
		session.close();
	}


}
