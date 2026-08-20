package org.example.eagerAndLazyFetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Laptops laptops=new Laptops();
//        laptops.setId(1);
//        laptops.setName("HP");
//        laptops.setRam(8);
//
//        Laptops laptops1=new Laptops();
//        laptops1.setId(2);
//        laptops1.setName("Dell");
//        laptops1.setRam(16);
//
//        Laptops laptops2=new Laptops();
//        laptops2.setId(3);
//        laptops2.setName("Mac");
//        laptops2.setRam(16);
//
//        Users user=new Users();
//        user.setId(101);
//        user.setName("Rajesh");
//        user.setTech("Dev");
//
//        Users user2=new Users();
//        user2.setId(102);
//        user2.setName("Altaf");
//        user2.setTech("Dev");
//
//        user.setLaptops(Arrays.asList(laptops,laptops1));
//        user2.setLaptops(List.of(laptops2));


        SessionFactory sf= new Configuration()
                .addAnnotatedClass(Users.class)
                .addAnnotatedClass(org.example.eagerAndLazyFetch.Laptops.class)
                .configure().buildSessionFactory();

        Session session=sf.openSession();
//        Transaction transaction=session.beginTransaction();
//        session.persist(laptops);
//        session.persist(laptops1);
//        session.persist(laptops2);
//        session.persist(user);
//        session.persist(user2);
//        transaction.commit();

        Session session2= sf.openSession();
        Users user4=session2.get(Users.class,101);
//        System.out.println(user4);


        sf.close();
    }
}
