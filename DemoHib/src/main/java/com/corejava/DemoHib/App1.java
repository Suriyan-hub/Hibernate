package com.corejava.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Person.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		//get()
		Person p=session.get(Person.class, 2);
		System.out.println("Method Executed");
		System.out.println(p.getPname());
		session.getTransaction().commit();
		session.close();
		
		Session session1=sf.openSession();
		session1.beginTransaction();
		//load()
		Person p1=session1.load(Person.class, 3);
		System.out.println("Method Executed");
		System.out.println(p1.getPname());
		session1.getTransaction().commit();
		session1.close();
	}

}
