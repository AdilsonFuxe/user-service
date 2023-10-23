package org.adilsonufxe.estore.service;

import org.adilsonufxe.estore.models.User;

public interface UserService {
    User createUser(String firstName, String lastName, String email, String password, String passwordConfirmation);
}
