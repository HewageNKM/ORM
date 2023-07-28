package com.kawishika;

import com.kawishika.entity.Student;
import com.kawishika.entity.Subject;
import com.kawishika.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /*Laptop laptop = new Laptop("L002","Zenbook","Dell");
        session.persist(laptop);
        session.persist(new Student("S002","Nadun Kawishika",laptop));*
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
        session.persist(watch4);*/
        Subject subject1 = new Subject("S001","Maths",null);
        Subject subject2 = new Subject("S002","Science",null);

        Student student1 = new Student("S001","Kawishkia",null);
        Student student2 = new Student("S002","Nadun",null);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        ArrayList<Subject> subjectArrayList = new ArrayList<>();

        studentArrayList.add(student1);
        studentArrayList.add(student2);

        subjectArrayList.add(subject1);
        subjectArrayList.add(subject2);

        subject1.setStudents(studentArrayList);
        subject2.setStudents(studentArrayList);

        student1.setSubjects(subjectArrayList);
        student2.setSubjects(subjectArrayList);

        session.persist(student1);
        session.persist(student2);
        session.persist(subject1);
        session.persist(subject2);
        transaction.commit();
        session.close();
    }
}