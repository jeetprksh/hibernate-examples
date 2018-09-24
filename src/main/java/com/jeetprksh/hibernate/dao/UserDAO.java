package com.jeetprksh.hibernate.dao;

import com.jeetprksh.hibernate.entity.User;
import org.hibernate.HibernateException;

import java.util.List;

public interface UserDAO {

    public int createUser(User user) throws HibernateException;

    public User getUser(int id) throws HibernateException;

    public List<User> listAllUsers() throws HibernateException;

}
