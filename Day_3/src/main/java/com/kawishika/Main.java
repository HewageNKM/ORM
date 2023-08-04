package com.kawishika;

import com.kawishika.entity.CRoom;
import com.kawishika.entity.Student;
import com.kawishika.util.SessionConfigure;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = SessionConfigure.getInstance().getSession();
        CRoom cRoom = new CRoom("CR001","A",null);

        Student student = new Student("S001","Kawishkia","Colombo",cRoom);
        Student student1 = new Student("S002","Nadun","Gampaha",cRoom);
        Student student2 = new Student("S003","Kawishkia","Dompe",cRoom);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(student);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        cRoom.setStudents(studentArrayList);

        session.beginTransaction();
        //session.persist(cRoom);
       /* session.persist(student);
        session.persist(student1);
        session.persist(student2);*/

        /*CRoom cRoom1 = session.get(CRoom.class, "CR001");
        System.out.println(cRoom1.getCId());
        System.out.println(cRoom1.getCName());
        List<Student> students = cRoom1.getStudents();
        for (Student student0:students) {
            System.out.println(student0.getSId()+" ");
        }*/
        Student student3 = session.get(Student.class, "S001");

        session.remove(student3);
        session.getTransaction().commit();
    }
}