package org.Maaz;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(3);
        s1.setsName("Maaz");
        s1.setsAge(25);

        Configuration cfg = new Configuration();

        cfg.addAnnotatedClass(org.Maaz.Student.class);
        cfg.configure();

        SessionFactory sF = cfg.buildSessionFactory();
        Session session = sF.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);


        transaction.commit();

        System.out.println(s1);

    }
}