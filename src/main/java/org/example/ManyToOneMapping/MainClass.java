package org.example.ManyToOneMapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Laptops laptops=new Laptops();
        laptops.setBrand("HP");
        laptops.setId(1);
        laptops.setRam(8);

        Users users=new Users();
        users.setId(101);
        users.setLaptops(List.of(laptops));
        users.setName("Altaf");
        users.setTech("Testing");
        laptops.setUsers(users);

        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.ManyToOneMapping.Users.class)
                .addAnnotatedClass(org.example.ManyToOneMapping.Laptops.class)
                .configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(laptops);
        session.persist(users);

        // throw exception because of toString(), both class uses each class object
//        System.out.println(users);
        transaction.commit();
        session.close();


        sf.close();

    }
}
