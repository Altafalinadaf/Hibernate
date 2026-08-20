package org.example.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.setName("Lenova");
        laptop.setModel("Intel");
        laptop.setRam(4);
        ProductDetails p=new ProductDetails(laptop);
        p.setpName("Laptop");
        p.setId(1);
        p.setPrice(50000);


        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.embeddable.ProductDetails.class).configure().buildSessionFactory();

        Session session=sf.openSession();
        session.persist(p);
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        System.out.println(p);


        session.close();
        sf.close();
    }
}
