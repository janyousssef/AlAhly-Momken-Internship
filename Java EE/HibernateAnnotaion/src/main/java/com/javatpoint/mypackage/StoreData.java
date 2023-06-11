package com.javatpoint.mypackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class StoreData {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure();

		ServiceRegistry ssr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = con.buildSessionFactory(ssr);
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Employee       e1 = new Employee("jan", 2021);
		Employee       e2 = new Employee("ayoub", 2020);
		Employee       e3 = new Employee("ahmed", 2025);
		JuniorEmployee j1 = new JuniorEmployee("gamal", 2011, 2, 3);
		JuniorEmployee j2 = new JuniorEmployee("kareem", 2013, 3, 7);
		JuniorEmployee j3 = new JuniorEmployee("mustafa", 2010, 1, 4);
		SeniorEmployee s1 = new SeniorEmployee("mohamed", 2018, 2000, 3);
		SeniorEmployee s2 = new SeniorEmployee("mena", 2014, 4000, 8);
		SeniorEmployee s3 = new SeniorEmployee("hamza", 2017, 5000, 6);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(j1);
		session.save(j2);
		session.save(j3);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		t.commit();
		System.out.println("successfully saved");
		Query query=session.createQuery("from Employee ");
		List list=query.list();  
		Iterator it=list.iterator();
		while(it.hasNext())System.out.println(it.next());
		session.close();
		sessionFactory.close();

	}
}
