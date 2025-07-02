package org.Maaz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import javax.management.Query;
import org.hibernate.query.Query;

import java.io.Console;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        SessionFactory sF = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sF.openSession();
        Laptop lap = session.get(Laptop.class,1);
        System.out.println(lap);
        session.close();

        sF.close();

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




