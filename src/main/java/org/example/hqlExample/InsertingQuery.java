package org.example.hqlExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertingQuery {
    public static void main(String[] args) {
        Laptop laptops=new Laptop();
        laptops.setId(1);
        laptops.setRam(16);
        laptops.setName("HP");
        laptops.setTech("Testing");

        Laptop laptops1=new Laptop();
        laptops1.setId(2);
        laptops1.setRam(16);
        laptops1.setName("Dell");
        laptops1.setTech("Testing");

        Laptop laptops2=new Laptop();
        laptops2.setId(3);
        laptops2.setRam(16);
        laptops2.setName("Apple");
        laptops2.setTech("Developer");

        Laptop laptops3=new Laptop();
        laptops3.setId(4);
        laptops3.setRam(16);
        laptops3.setName("Lenova");
        laptops3.setTech("Developer");

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure().buildSessionFactory();

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(laptops);
        session.persist(laptops1);
        session.persist(laptops2);
        session.persist(laptops3);
        transaction.commit();

        sf.close();
        session.close();

    }
}
