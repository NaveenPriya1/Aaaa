package com.hybernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernate.EProduct;



public class HibernateUtil {

	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EProduct.class)
				.buildSessionFactory();
		return sessionFactory;
	}
}