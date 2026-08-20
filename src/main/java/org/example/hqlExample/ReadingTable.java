package org.example.hqlExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ReadingTable {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure().buildSessionFactory();
        Session session=sf.openSession();

        //normal query to access data using query
        Laptop laptops=session.get(Laptop.class,1);
        System.out.println(laptops);

        // if I want to access data based on ram then we can't go with normal query
        // to access based on ram,or model in that case we should go with HQL
        // HQL - hibernate query language

        // WAQTP laptop details who ram is 16
        // sql - select * from laptops where ram =16
        // hbl - from laptops where ram = 16
        // from laptops - means all data in the table

        Query query=session.createQuery("from Laptop");
        List<Laptop> laptopList=query.getResultList();
        // below line print in single line
//        System.out.println(laptopList);

        // using enhance for loop
        for(Laptop lap:laptopList){
            System.out.println(lap);
        }


        // query to print laptop which is working by developer
        Query query1=session.createQuery("from Laptop where ram=16");
        List<Laptop> laptopRam=query1.getResultList();
        for(Laptop lap: laptopRam){
            System.out.println(lap);
        }
        sf.close();
    }
}
