package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration =  new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        student p1 = new student(1, "sname1", "address1", "sphn1");
        student p2 = new student(2, "sname2", "address2", "sphn2");
        student p3= new student(3, "sname3", "address3", "sphn3");
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(p1);

        tx.commit();

        factory.close();
    }
}
