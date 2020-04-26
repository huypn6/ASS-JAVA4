package com.java4.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	public static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml").configure();

			// TODO add class
			configuration.addResource("Message.hbm.xml");

			return configuration.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
