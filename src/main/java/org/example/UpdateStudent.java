package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
    public static void main(String[] args) {
        Students s3=new Students();
        s3.setRollnum(13);
        s3.setAge(21);
        s3.setName("Sara");

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Students.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.merge(s3);
        transaction.commit();

        System.out.println(s3);
        session.close();

        sf.close();

    }
}
