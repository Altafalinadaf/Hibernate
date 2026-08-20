package org.example.practiseset;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeMain {
    public static void main(String[] args) {
//        Employee emp1=new Employee();
//        emp1.setId(3);
//        emp1.setName("Rajesh");
//        emp1.setAge(25);
//        emp1.setSalary(50000);

        Configuration configuration=new Configuration();
        configuration.addAnnotatedClass(org.example.practiseset.Employee.class);
        configuration.configure();
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();

        Transaction transaction=session.beginTransaction();

//        Employee emp2=session.get(Employee.class,1);
//        System.out.println(emp2.getAge()+" "+emp2.getSalary()+" "+emp2.getId());
//
//        Employee emp2=new Employee();
//        emp2.setId(1);
//        emp2.setSalary(60000);
//        emp2.setName("Ravitej");
//        emp2.setAge(25);
//
//        session.merge(emp2);
//        transaction.commit();

        Employee emp2=session.get(Employee.class,1);
        System.out.println(emp2.getAge()+" "+emp2.getSalary()+" "+emp2.getId()+" "+emp2.getName());

//        System.out.println(emp2);

        sf.close();


    }
}
