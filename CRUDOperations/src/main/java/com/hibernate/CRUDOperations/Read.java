package com.hibernate.CRUDOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Book book = session.get(Book.class, 102);
    	session.getTransaction().commit();
    	System.out.println(book);
	}

}
