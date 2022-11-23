package com.corejava.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Person.class);
        
    	Person p=new Person();
        //p.setPid(1);
        p.setPname("Grace");
        p.setStreet("Pebbles");
        

        //Store data or persist data
       
        SessionFactory sf=con.buildSessionFactory();
        Session session =sf.openSession();
        
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        System.out.println("person saved..check db");
    }
}
