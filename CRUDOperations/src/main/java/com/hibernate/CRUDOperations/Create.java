package com.hibernate.CRUDOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class Create 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=HibernateUtil.getSessionFactory();
    	Session session=sf.openSession();
    	Book b=new Book();
    	b.setId(3);
    	b.setName("Cinderalla");
    	b.setAuthor("ABC");
    	
    	session.beginTransaction();
    	session.save(b);
    	session.getTransaction().commit();
    	System.out.println("Saved the data .. Check db");
    }
}
    	
    	
    
