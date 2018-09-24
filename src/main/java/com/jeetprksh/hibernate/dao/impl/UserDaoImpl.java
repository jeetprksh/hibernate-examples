package com.jeetprksh.hibernate.dao.impl;

import com.jeetprksh.hibernate.dao.UserDAO;
import com.jeetprksh.hibernate.entity.User;
import org.hibernate.HibernateException;

import java.util.List;

public class UserDaoImpl extends CommonDaoImpl implements UserDAO {

    @Override
    public int createUser(User user) throws HibernateException {
        return super.saveEntity(user);
    }

    @Override
    public User getUser(int id) throws HibernateException {
        return null;
    }

    @Override
    public List<User> listAllUsers() throws HibernateException {
        return null;
    }

}
