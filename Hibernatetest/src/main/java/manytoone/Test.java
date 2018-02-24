package manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		University u=new University( "PU", "India");
		Student st1= new Student( "Amol", u);
		Student st2= new Student( "SWAP", u);
		Student st3= new Student( "ABHI", u);
		
		SessionFactory sf= new Configuration().configure("OneTOMAny.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr =s.beginTransaction();
		
		
		st1.setUniversityDetails(u);
		s.persist(u);
		s.persist(st1);
		s.persist(st2);
		s.persist(st3);
		tr.commit();
		s.close();

		
	}

}
