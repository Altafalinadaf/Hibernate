package org.example.fetchWithFilterAndGetLoadMethod;

import org.example.hqlExample.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

public class FetchData {
    public static void main(String[] args) {
        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example.fetchWithFilterAndGetLoadMethod.Brand.class)
                .configure().buildSessionFactory();
        Session session=sf.openSession();
        // the below query returns raw type
        //Query<Brand> query=session.createQuery("from Brand");
        // returns only Brand type
        Query<Brand> query=session.createQuery("from Brand",Brand.class);
        System.out.println(query);

        // getting all the values
        List<Brand> brands=query.getResultList();
        for(Brand b:brands){
            System.out.println(b);
        }


        // use list of integer when you're returning integer values
        Query<Integer> query1=session.createQuery("select price from Brand",Integer.class);
        List<Integer> list=query1.getResultList();
        for(Integer i:list){
            System.out.println(i);
        }

        // pass value by user the use '?1' or'?2' - '?' is fixed and number you can set according to you
        System.out.println("Vivo brand price ");
        String bname="Vivo";
        Query<Integer> query2=session.createQuery("select price from Brand where name =?1",Integer.class);
        query2.setParameter(1,bname);
        List<Integer> list1=query2.getResultList();
        for (Integer b:list1){
            System.out.println(b);
        }



        sf.close();
    }
}
