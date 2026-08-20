package org.example.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.setId(1);
        laptop.setBrand("Dell");
        laptop.setRam(16);
        Users users =new Users();
        users.setLaptop(laptop);
        users.setUid(101);
        users.setuName("Suresh");
        users.setTech("Developer");

        SessionFactory sf=new Configuration().addAnnotatedClass(Users.class)
                        .addAnnotatedClass(org.example.oneToOneMapping.Laptop.class).configure()
                        .buildSessionFactory();

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(laptop);
        session.persist(users);

        transaction.commit();
        System.out.println(users);

        sf.close();
        session.close();

    }
}
