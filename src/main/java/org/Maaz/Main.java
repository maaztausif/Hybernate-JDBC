package org.Maaz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Console;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setId(0);
        l1.setModel("2024");
        l1.setBand("Macbook");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setId(1);
        l2.setModel("2022");
        l2.setBand("assus");
        l2.setRam(22);

        Laptop l3 = new Laptop();
        l3.setId(2);
        l3.setModel("2025");
        l3.setBand("Dell");
        l3.setRam(12);



        Alien a1 = new Alien();
        a1.setAid(0);
        a1.setAname("Tasbeen");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setAid(1);
        a2.setAname("Tasbeen Janu");
        a2.setTech("c#");

        Alien a3 = new Alien();
        a3.setAid(2);
        a3.setAname("Tasbeen Hathni");
        a3.setTech("Flutter");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l1,l3));
        a3.setLaptops(Arrays.asList(l3));

        l1.setAlien(Arrays.asList(a1,a2));
        l2.setAlien(Arrays.asList(a1));
        l3.setAlien(Arrays.asList(a2,a3));


// ===================== MARK: Long version =========================

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.Maaz.Student.class);
//        cfg.configure();

// ===================== MARK: Short form refactoring =========================

        SessionFactory sF = new Configuration()
                .addAnnotatedClass(org.Maaz.Alien.class)
                .addAnnotatedClass(org.Maaz.Laptop.class)
                .configure()
                .buildSessionFactory();       //cfg.buildSessionFactory();

        Session session = sF.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        transaction.commit();

        Alien a4 = session.find(Alien.class,2);
        System.out.println(a2);

        session.close();
        sF.close();

       //  Print krna he yahan pr
//        System.out.println(s2);

    }
}





// ===================== MARK: Previous task  =========================


//Student s1 = new Student();
//        s1.setRollNo(1);
//        s1.setsName("Miss you so much meri hathni :D");
//        s1.setsAge(25);
//
//Student s2 = null;
//
//// ===================== MARK: Long version =========================
//
////        Configuration cfg = new Configuration();
////        cfg.addAnnotatedClass(org.Maaz.Student.class);
////        cfg.configure();
//
//// ===================== MARK: Short form refactoring =========================
//
//SessionFactory sF = new Configuration()
//        .addAnnotatedClass(org.Maaz.Student.class)
//        .configure()
//        .buildSessionFactory();       //cfg.buildSessionFactory();
//
//Session session = sF.openSession();
//
////        s2 = session.find(Student.class,10);
//
//Transaction transaction = session.beginTransaction();
//
//s1 = session.find(Student.class,11);
//
//// ===================== MARK: Db main entry k liye use hoata he  =========================
////        session.persist(s1);
//
//// ===================== MARK: Update k liye merge use hota he =========================
////        session.merge(s1);
//
//
//
//// ===================== MARK: Delete k liye remove use hota he =========================
//        session.remove(s1);
//
//        transaction.commit();
//        session.close();
//        sF.close();
//
//// Print krna he yahan pr
////        System.out.println(s2);




