package com.kawishika;

import com.kawishika.entity.Laptop;
import com.kawishika.entity.Student;
import com.kawishika.entity.Watch;
import com.kawishika.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // org.hibernate.Session session= (Session) FactoryConfiguration.getInstance().getSession();
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /*Laptop laptop = new Laptop("L002","Zenbook","Dell");
        session.persist(laptop);
        session.persist(new Student("S002","Nadun Kawishika",laptop));*/
        Student student2 = new Student("S002","Nadun");
        Student student1 = new Student("S001","Kawishkia");

        ArrayList<Watch> watchArrayList = new ArrayList<>();
        ArrayList<Watch> watchArrayList1 = new ArrayList<>();

        Watch watch = new Watch("W001","JJ","JJ",student1);
        Watch watch1 = new Watch("W002","JK","JJL",student1);
        watchArrayList.add(watch);
        watchArrayList.add(watch1);

        Watch watch3 = new Watch("W003","JKK","JJOL",student2);
        Watch watch4 = new Watch("W004","PJK","JOJL",student2);
        watchArrayList1.add(watch3);
        watchArrayList1.add(watch4);
        student1.setWatches(watchArrayList1);
        student2.setWatches(watchArrayList);

        session.persist(student1);
        session.persist(student2);
        session.persist(watch1);
        session.persist(watch);
        session.persist(watch3);
        session.persist(watch4);
        transaction.commit();
        session.close();
    }
}