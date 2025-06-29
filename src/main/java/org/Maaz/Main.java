package org.Maaz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setsName("Miss you so much meri hathni :D");
        s1.setsAge(25);

        Student s2 = null;

// ===================== MARK: Long version =========================

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.Maaz.Student.class);
//        cfg.configure();

// ===================== MARK: Short form refactoring =========================

        SessionFactory sF = new Configuration()
                .addAnnotatedClass(org.Maaz.Student.class)
                .configure()
                .buildSessionFactory();       //cfg.buildSessionFactory();

        Session session = sF.openSession();

        s2 = session.find(Student.class,10);

        Transaction transaction = session.beginTransaction();
        session.persist(s1);


        transaction.commit();

        session.close();
        sF.close();

        // Print krna he yahan pr
        System.out.println(s2);

    }
}