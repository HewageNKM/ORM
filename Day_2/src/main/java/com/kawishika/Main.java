package com.kawishika;

import com.kawishika.entity.Laptop;
import com.kawishika.entity.Student;
import com.kawishika.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // org.hibernate.Session session= (Session) FactoryConfiguration.getInstance().getSession();
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Laptop laptop = new Laptop("L002","Zenbook","Dell");
        session.persist(laptop);
        session.persist(new Student("S002","Nadun Kawishika",laptop));
        transaction.commit();
        session.close();
    }
}