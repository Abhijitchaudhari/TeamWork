package OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		Address address=new Address(425001, "Jalgaon");
		Person person=new Person(1," Amol", address);
		
		
		SessionFactory sf=new Configuration().configure("Oneperson.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(address);
		person.setAddress(address);
		s.save(person);
		tr.commit();
		s.close();
		

		
	}

}
