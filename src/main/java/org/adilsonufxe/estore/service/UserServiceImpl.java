package org.adilsonufxe.estore.service;

import org.adilsonufxe.estore.models.User;

public class UserServiceImpl implements UserService {
    public User createUser(String firstName, String lastName, String email, String password,
                           String passwordConfirmation) {
        return new User();
    }
}
