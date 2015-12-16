package jpa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionManager
{
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		try
		{
			// Create a SessionFactory from hibernate.cfg.xml
			// return new Congfiguration().configure().buildDessionFactory();
			return new AnnotationConfiguration().configure()
											    .buildSessionFactory();
		}
		catch( Throwable ex )
		{
			// make sure to log exception, as it may get lost
			System.err.println( "SessionFactory creation failed." + ex );
			throw new ExceptionInInitializerError( ex );
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static void shutdown()
	{
		// close caches and connection pools
		getSessionFactory().close();
	}
}