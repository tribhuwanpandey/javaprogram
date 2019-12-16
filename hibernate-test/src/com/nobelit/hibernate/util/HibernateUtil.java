package com.nobelit.hibernate.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buidSesionFactory();

	private static SessionFactory buidSesionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;

	}

	public static void shutdown() {
		if (sessionFactory != null)
			sessionFactory.close();
	}
}
