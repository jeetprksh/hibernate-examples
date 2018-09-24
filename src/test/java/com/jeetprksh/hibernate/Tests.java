package com.jeetprksh.hibernate;

import static org.junit.Assert.assertTrue;

import com.jeetprksh.hibernate.dao.UserDAO;
import com.jeetprksh.hibernate.dao.impl.UserDaoImpl;
import com.jeetprksh.hibernate.entity.User;
import org.junit.Test;

import java.util.logging.Logger;

public class Tests {

    private static final Logger logger = Logger.getLogger(Tests.class.getName());

    private UserDAO userDao;

    public Tests() {
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void testInsertUser() {
        User user = new User("Robb", "Stark", 25);
        Integer id = (Integer) userDao.createUser(user);
        assertTrue(id instanceof Integer);
    }
}
