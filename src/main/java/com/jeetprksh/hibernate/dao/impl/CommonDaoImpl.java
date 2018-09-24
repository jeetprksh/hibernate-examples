package com.jeetprksh.hibernate.dao.impl;

import com.jeetprksh.hibernate.config.HibernateConfig;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CommonDaoImpl {

    private SessionFactory sessionFactory;
    private Session session;

    public CommonDaoImpl() {
        this.sessionFactory = HibernateConfig.getSessionFactory();
        this.session = sessionFactory.getCurrentSession();
    }

    protected int saveEntity(Object obj) throws HibernateException {
        Transaction transaction = session.beginTransaction();
        int id = (Integer) session.save(obj);
        transaction.commit();
        return id;
    }
}
