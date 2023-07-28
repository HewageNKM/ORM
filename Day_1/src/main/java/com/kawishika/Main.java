package com.kawishika;

import com.kawishika.entity.Customer;
import com.kawishika.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(new Customer("C001","Maleesha","Dekatana"));
        transaction.commit();
        session.close();
    }
}