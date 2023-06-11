package hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		
		Employee e1=new Employee(1, "jan", 2000);
		s.save(e1);
		
		
		
	}

}
