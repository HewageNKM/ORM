package com.kawishika.util;

import com.kawishika.entity.CRoom;
import com.kawishika.entity.Student;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionConfigure {
    private static SessionConfigure sessionConfigure;
    private final Session session;
    private SessionConfigure() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(CRoom.class).addAnnotatedClass(Student.class);
        session = configuration.buildSessionFactory().openSession();
    }
    public static SessionConfigure getInstance(){
        if (sessionConfigure == null){
            sessionConfigure = new SessionConfigure();
        }
        return sessionConfigure;
    }
    public Session getSession(){
        return session;
    }
}
