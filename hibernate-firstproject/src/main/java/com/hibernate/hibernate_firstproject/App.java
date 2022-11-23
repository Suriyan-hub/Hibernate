package com.hibernate.hibernate_firstproject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
    	Book b=new Book("abc","abcdefgh");
    	//create configuration
    	
    	Configuration cf=new Configuration();
    	cf.configure("hibernate.cfg.xml");
    	cf.addAnnotatedClass(Book.class);
    	//create session factory
    	SessionFactory  sf=cf.buildSessionFactory();
    	//initialize the session object
    	Session session=sf.openSession();//opensession for getting session objects
        
        
        
        session.beginTransaction();
        
		Query<Book> createNamedQuery =session.createNamedQuery("Myproj.allbook", Book.class);
		System.out.println(createNamedQuery.list());
       
        //session.save(b);
        session.getTransaction().commit();
        session.close();
        System.out.println(b);
    }
}
