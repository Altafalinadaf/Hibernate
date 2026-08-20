package org.example.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Laptops laptops=new Laptops();
        laptops.setRam(8);
        laptops.setId(1);
        laptops.setBrand("HP");

        Laptops laptops1=new Laptops();
        laptops1.setBrand("Apple");
        laptops1.setId(2);
        laptops1.setRam(16);

        Laptops laptops2=new Laptops();
        laptops2.setRam(8);
        laptops2.setId(3);
        laptops2.setBrand("Lenova");

        Users users=new Users();
        users.setTech("dev");
        users.setName("Altaf");
        users.setId(101);

        Users users1=new Users();
        users1.setId(102);
        users1.setName("Rajesh");
        users1.setTech("Testing");

        Users users2=new Users();
        users2.setTech("Testing");
        users2.setName("Rohit");
        users2.setId(103);

        laptops.setUsers(Arrays.asList(users1,users));
        laptops1.setUsers(Arrays.asList(users1,users2));
        laptops2.setUsers(Arrays.asList(users2));

        users.setLaptops(Arrays.asList(laptops1,laptops2));
        users1.setLaptops(Arrays.asList(laptops,laptops2));
        users2.setLaptops(Arrays.asList(laptops));

        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.manyToManyMapping.Laptops.class)
                .addAnnotatedClass(org.example.manyToManyMapping.Users.class)
                .configure().buildSessionFactory();


        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(laptops);
        session.persist(laptops1);
        session.persist(laptops2);
        session.persist(users);
        session.persist(users1);
        session.persist(users2);
        transaction.commit();
        Users users3=session.get(Users.class,102);
        System.out.println(users3);
        session.close();

        sf.close();


    }
}
