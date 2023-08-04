package com.kawishika;

import com.kawishika.entity.Student;
import com.kawishika.util.SessionConfigure;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class HQL {
    public static void main(String[] args) {
        Session session = SessionConfigure.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        /*Query query = session.createQuery("from Student");
        List<Student> list = query.list();
        for (Student student:list) {
            System.out.println(student.getSId()+" ,"+student.getName()+" ,"+student.getAddress());
        }*/
        /*Query query = session.createQuery("select name,address from Student where sId=?1");
        query.setParameter(1,"S001");
        Object[] o = (Object[]) query.uniqueResult();
        System.out.println(o[0]+" ,"+o[1]);*/
        /*Query query = session.createQuery("select sId,name from Student");
        List<Object[]> list = query.list();
        for (Object[] o:list) {
            System.out.println(o[0]+" ,"+o[1]);
        }*/
        /*Query query = session.createQuery("SELECT cId,cName,sId,address,name from CRoom c RIGHT JOIN Student S on c.cId = S.cRoom.cId");
        List<Object[]> list = query.list();
        for (Object[] o:list) {
            System.out.println(Arrays.toString(o));
        }*/
        /*NativeQuery nativeQuery = session.createNativeQuery("SELECT cid,cName,sId,address,name from CRoom RIGHT JOIN ijse.Student S on CRoom.cId = S.cRoom_cId");
        List<Object[]> list = nativeQuery.list();
        for (Object[] o:list) {
            System.out.println(Arrays.toString(o));
        }*/
        /*NativeQuery nativeQuery1 = session.createNativeQuery("SELECT * FROM Student");
        nativeQuery1.addEntity(Student.class);
        List<Student> list1 = nativeQuery1.list();
        for (Student student:list1) {
            System.out.println(student.getSId()+" ,"+student.getName()+" ,"+student.getAddress());
        }*/

        transaction.commit();
    }
}
