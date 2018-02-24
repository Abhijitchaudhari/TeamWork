package com.onetone.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		UserPicture up=new UserPicture(1, "Any", null);
		User u=new User(1,"	 Abhi", "chau", up);
		SessionFactory sf=new Configuration().configure("hibernateone.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr =s.beginTransaction();
		 up.setUser(u);
		// u.setUserPicture(up);
		 s.save(u);
		 tr.commit();
		 s.close();
		 
		 
		 }
}
