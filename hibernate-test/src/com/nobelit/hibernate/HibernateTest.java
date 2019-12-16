package com.nobelit.hibernate;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.nobelit.hibernate.model.Book;
import com.nobelit.hibernate.util.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		
		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

		Date pDate1 = new Date(2019, 11, 19);
		Date pDate2 = new Date(2018, 10, 12);
		Date pDate3 = new Date(2017, 19, 11);
		
		//LocalDate d = LocalDate.of(2018, 11, 10);
		
		Book book1 = new Book("java", "kathy",pDate1 , 600);
		Book book2 = new Book("scjp", "kathy",pDate2 , 500);
		Book book3 = new Book("advance java", "kathy sierra",pDate3 , 400);
		session.save(book1);
		session.save(book2);
		session.save(book3);
		txn.commit();

		System.out.println("Book Object is Saved.");

		session.close();

		HibernateUtil.shutdown();
	}
}

