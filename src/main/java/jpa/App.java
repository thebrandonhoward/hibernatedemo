package jpa;

import org.hibernate.Session;

public class App {

	public static void main(String[] args)
	{
		Session session = HibernateSessionManager.getSessionFactory()
											     .openSession();
		
		session.beginTransaction();
		
		ActivityType activityType = new ActivityType();
		activityType.setActivityTypeCode( 777 );
		
		session.save( activityType );
		
		session.getTransaction().commit();
		
		System.out.println( "Done." );
	}

}
