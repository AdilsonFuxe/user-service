package org.adilsonufxe.estore.service;

import org.adilsonufxe.estore.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject() {
        // Arrange

        UserService userService = new UserServiceImpl();

        String firstName = "any_first_name";
        String lastName = "any_last_name";
        String email = "any_mail@mail.com";
        String password = "any_password";
        String passwordConfirmation = "any_password";

        // Act

        User user = userService.createUser(firstName, lastName, email, password, passwordConfirmation);

        // Assert
        Assertions.assertNotNull(user);
    }
}
