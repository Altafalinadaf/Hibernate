package org.example.fetchWithFilterAndGetLoadMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAndLoadMethod {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.fetchWithFilterAndGetLoadMethod.Brand.class)
                .configure().buildSessionFactory();

        Session session= sf.openSession();
        // get will display the query even when you print b or not
        Brand b=session.get(Brand.class,2);

        // this will not throw the query unless you don't print b2
        Brand b2=session.load(Brand.class,3);
//        System.out.println(b2); // if you print this then load will throw query else no query

        // new load with is getReference
        Brand b3= session.getReference(Brand.class, 4);
        System.out.println(b3);



    }
}
