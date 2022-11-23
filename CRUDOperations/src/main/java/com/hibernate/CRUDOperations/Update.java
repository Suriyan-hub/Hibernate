package com.hibernate.CRUDOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
    	Session session=sf.openSession();
    	Book book = session.get(Book.class, 101);
    	book.setName("The Kids Stories");
    	session.beginTransaction();
    	session.update(book);
    	session.getTransaction().commit();
    	System.out.println("Successfully Updated:");
    	
	}

}
