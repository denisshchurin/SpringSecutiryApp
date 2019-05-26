package com.denis.springsecurityapp.service;

import com.denis.springsecurityapp.model.User;

/**
 * Service class for {@link User}
 *
 * @author Denis Shchurin
 * @version 1.0
 */

public interface UserService {
    void save(User user);

    User findByUserName(String username);
}
