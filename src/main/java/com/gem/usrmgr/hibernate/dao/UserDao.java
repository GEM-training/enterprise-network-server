package com.gem.usrmgr.hibernate.dao;

import com.gem.usrmgr.hibernate.model.User;

import java.util.List;

/**
 * Created by kimtung on 2/17/16.
 */
public interface UserDao extends AbstractDao<User> {

    List<User> list();

    User findByUsername(String username);

    boolean isUsernameAvailable(String username);

}
