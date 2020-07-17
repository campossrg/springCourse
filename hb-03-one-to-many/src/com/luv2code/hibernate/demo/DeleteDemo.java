package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		System.out.println("Starting...");
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
					
			session.beginTransaction();

			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("Found instructor: " + tempInstructor);
			
			if(tempInstructor != null) {
				System.out.println("Deleting: " + tempInstructor);
				
				session.delete(tempInstructor);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		
		catch (Exception exc){
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
		
		finally {
			factory.close();
		}
	}


}
