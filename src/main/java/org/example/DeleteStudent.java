package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {
        Students s5=new Students();

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Students.class).configure().buildSessionFactory();

        Session session=sf.openSession();
        s5=session.get(Students.class,13);
        Transaction transaction=session.beginTransaction();

        session.remove(s5);
        transaction.commit();
        sf.close();
    }
}
