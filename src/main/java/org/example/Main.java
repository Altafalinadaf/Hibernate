package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeDetails emp=new EmployeeDetails();
        emp.setEmpName("Navin");
        emp.setEid(1);
        emp.setAge(23);

        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(org.example.EmployeeDetails.class);
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(emp);
        transaction.commit();
        System.out.println(emp);

    }
}