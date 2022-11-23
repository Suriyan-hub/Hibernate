package com.hibernate.hibernate_firstproject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	//create configuration
    	
    	Configuration cf=new Configuration();
    	cf.configure("hibernate.cfg.xml");
    	cf.addAnnotatedClass(Book.class);
    	//create session factory
    	SessionFactory  sf=cf.buildSessionFactory();
    	//initialize the session object
    	Session session=sf.openSession();//opensession for getting session objects
        
        
        
        session.beginTransaction();
        //createCriteria API can be used to fetach data programitically without writing query.Query will be written by hibernate
		Criteria createCriteria = session.createCriteria(Book.class);
		List list = createCriteria.list();
		System.out.println(list);
        session.getTransaction().commit();
        session.close();
        
	}

}
