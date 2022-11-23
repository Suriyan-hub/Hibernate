package com.corejava.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Configuration cf=new Configuration();
  cf.configure("hibernate.cfg.xml");
  cf.addAnnotatedClass(Person.class);
  
  
  SessionFactory sf=cf.buildSessionFactory();
  Session session=sf.openSession();
  session.beginTransaction();
  Person p=new Person("Riya","Palayalam");//transient state
  session.save(p);//persistence state
  session.getTransaction().commit();
  session.close();
  System.out.println(p);
  
  
	}

}
