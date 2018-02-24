package inheratance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSTudent {
public static void main(String[] args) {
	
	Student st1=new Student(10," Amol");
	Student st2=new Student(20," Swap");
	Student st3=new Student(30," Abhi");
	PermanentStudent p1=new PermanentStudent(201, "x");
	PermanentStudent p2=new PermanentStudent(202, "y");
	PermanentStudent p3=new PermanentStudent(203, "z");


	
	
	SessionFactory sf=new Configuration().configure("student.cfg.xml").buildSessionFactory();
	Session s= sf.openSession();
	Transaction tr=s.beginTransaction();

	s.save(st1);
	s.save(st2);
	s.save(st3);
	
	s.save(p1);
	s.save(p2);
	s.save(p3);
	s.flush();
	tr.commit();
	
	
}
}
