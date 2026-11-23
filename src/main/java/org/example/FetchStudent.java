package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchStudent {
    public static void main(String[] args) {
        Students s2=null;

        SessionFactory factory=new Configuration()
                .addAnnotatedClass(org.example.Students.class).configure().buildSessionFactory();
        Session session=factory.openSession();

        //trasaction is required for manipulating data not while accessing data

        s2=session.get(Students.class,1);
        System.out.println(s2);

        factory.close();
        session.close();

    }
}
