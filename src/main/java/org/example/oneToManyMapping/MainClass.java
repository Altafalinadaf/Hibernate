package org.example.oneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Laptop laptops=new Laptop();
        laptops.setRam(16);
        laptops.setId(1);
        laptops.setModel("Asus");

        Laptop laptop2=new Laptop();
        laptop2.setModel("Hp");
        laptop2.setId(2);
        laptop2.setRam(8);

        Users users=new Users();
        users.setLaptops(Arrays.asList(laptops,laptop2));
        users.setTech("Dev");
        users.setUid(101);
        users.setUname("Rajesh");

        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.oneToManyMapping.Users.class)
                        .addAnnotatedClass(org.example.oneToManyMapping.Laptop.class)
                                .configure().buildSessionFactory();

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(laptops);
        session.persist(laptop2);
        session.persist(users);

        transaction.commit();

        sf.close();
        session.close();


        System.out.println(users);

    }
}
