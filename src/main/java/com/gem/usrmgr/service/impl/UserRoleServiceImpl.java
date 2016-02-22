package com.gem.usrmgr.service.impl;

import com.gem.usrmgr.hibernate.dao.UserRoleDao;
import com.gem.usrmgr.hibernate.model.UserRole;
import com.gem.usrmgr.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by quanda on 19/02/2016.
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public List<String> findByUsername(String username) {
        return userRoleDao.findByUsername(username);
    }
}
