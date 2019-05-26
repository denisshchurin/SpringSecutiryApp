package com.denis.springsecurityapp.service;

import com.denis.springsecurityapp.dao.RoleDao;
import com.denis.springsecurityapp.dao.UserDao;
import com.denis.springsecurityapp.model.Role;
import com.denis.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService} interface
 *
 * @author Denis Shchurin
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Autowired
    RoleDao roleDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUsername(username);
    }
}
