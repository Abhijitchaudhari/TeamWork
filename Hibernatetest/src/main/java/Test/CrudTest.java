package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudTest {
	public static void main(String[] args) {
		Product p1 =new Product(80, "Product82", "Ten");
		Product p2 =new Product(70, "Product83", "Twenty");
		Product p3 =new Product(60, "Product84", "Thirty");
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		
	//	Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(p1);
		s.save(p2);
		s.save(p3);
//		s.flush();
		tr.commit();

	}

}
