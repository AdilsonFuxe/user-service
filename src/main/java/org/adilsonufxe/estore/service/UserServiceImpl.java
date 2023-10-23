package org.adilsonufxe.estore.service;

import org.adilsonufxe.estore.models.User;

import java.util.UUID;

public class UserServiceImpl implements UserService {
    public User createUser(String firstName, String lastName, String email, String password,
                           String passwordConfirmation) {
        if (firstName == null || firstName.trim().length() == 0)
            throw new IllegalArgumentException("User's first name is empty");
        return new User(firstName, lastName, email, String.valueOf(UUID.randomUUID()));
    }
}
