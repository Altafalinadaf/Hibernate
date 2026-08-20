package org.example.fetchWithFilterAndGetLoadMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertingData {
    public static void main(String[] args) {
        Brand brand1=new Brand();
        brand1.setId(1);
        brand1.setName("Apple");
        brand1.setPrice(100000);
        brand1.setStock(10);

        Brand brand2=new Brand();
        brand2.setId(2);
        brand2.setName("Samsung");
        brand2.setPrice(20000);
        brand2.setStock(15);

        Brand brand3=new Brand();
        brand3.setId(3);
        brand3.setName("Lenova");
        brand3.setPrice(10000);
        brand3.setStock(20);

        Brand brand4 =new Brand();
        brand4.setId(4);
        brand4.setName("Vivo");
        brand4.setPrice(30000);
        brand4.setStock(10);

        Brand brand5 =new Brand();
        brand5.setId(5);
        brand5.setName("Vivo");
        brand5.setPrice(40000);
        brand5.setStock(14);



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.fetchWithFilterAndGetLoadMethod.Brand.class)
                .configure().buildSessionFactory();

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(brand1);
        session.persist(brand2);
        session.persist(brand3);
        session.persist(brand4);
        session.persist(brand5);
        transaction.commit();

        sf.close();
        session.close();
    }
}
