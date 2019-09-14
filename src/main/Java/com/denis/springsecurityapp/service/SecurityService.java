package com.denis.springsecurityapp.service;

/**
 * Service for Security.
 *
 * @author Denis Shchurin
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
