package org.example;

import jakarta.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentMain {
    public static void main(String[] args) {
        Students st=new Students();
        st.setAge(19);
        st.setName("Sabbir");
        st.setRollnum(16);

//        one way to add data - no shortcut used here
//        Configuration configuration=new Configuration();
//        configuration.addAnnotatedClass(org.example.Students.class);
//        configuration.configure();
//        SessionFactory sessionFactory=configuration.buildSessionFactory();
//        Session session=sessionFactory.openSession();
//        Transaction transaction=session.beginTransaction();
//
//        session.save(st);
//        transaction.commit();
//        System.out.println(st);


        // one more way to use with shortcut
        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(org.example.Students.class).configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(st);
        transaction.commit();

        session.close();
        sessionFactory.close();
        System.out.println(st);
    }
}
