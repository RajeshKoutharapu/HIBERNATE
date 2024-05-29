package com.crudop;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class crudopmain {

	public static void main(String[] args) {
	Configuration config=new Configuration();
	 config.configure();
	 SessionFactory sessionFactory=config.buildSessionFactory();
	 Session session=sessionFactory.openSession();
	 Transaction tran=session.beginTransaction();
	 
	 //-->creating
//	 students obj=new students(1,"raj",25,"ongole");
//	  students obj1=new students(2,"mahi",45,"HYD");
//	  students obj2=new students(3,"kiran",65,"guntur");
//	  students obj3=new students(4,"deepika",100,"heaven");
//	  students obj4=new students(5,"geethika",55,"bapatla");
//	  students obj5=new students(6,"bhavya",95,"gudur");
//	  session.persist(obj);
//	  session.persist(obj1);
//	  session.persist(obj2);  
//	  session.persist(obj3);
//	  session.persist(obj4);
//	  session.persist(obj5);	
	 
	 
	 //-->updating
//	 students obj6=new students(1,"rajesh",98,"HYD");
//	 students obj7=new students(6,"rajesh",98,"HYD");
//	 students obj8=new students(2,"mahesh",88,"tenali");
//		 
//		 
//	 session.update(obj6);//depricated method
//   session.saveOrUpdate(obj7);//depricated method
//	 session.merge(obj8);//new method
	 
	 
	 // -->deleting 
	 students obj44=new students(2,"rajesh",98,"HYD");
	 students obj55=new students(6,"bhavya",95,"gudur");
	 session.delete(obj44);//depricated
	 session.remove(obj55);
	 
	 //--> retiving
	 students st=session.get(students.class,3);
	 System.out.println(st);
	 
	  
	  tran.commit();
	  session.close();
	    
	}

}
