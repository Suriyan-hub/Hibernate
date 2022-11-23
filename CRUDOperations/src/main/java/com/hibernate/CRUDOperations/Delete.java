package com.hibernate.CRUDOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
    	Session session=sf.openSession();
    	Book book = session.get(Book.class, 3);
    	session.beginTransaction();
    	session.delete(book);
    	session.getTransaction().commit();
    	System.out.println("Successfully Deleted:");
	}

}
