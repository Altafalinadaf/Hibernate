package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {
    public static void main(String[] args) {
        Product p=new Product();
        p.setId(2);
        p.setName("samsung");
        p.setPrice(40000);

        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(org.example.Product.class).configure().buildSessionFactory();

        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(p);
        transaction.commit();
        System.out.println(p);

        sessionFactory.close();
        session.close();

    }
}
