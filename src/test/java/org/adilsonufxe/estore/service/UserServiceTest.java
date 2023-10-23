package org.adilsonufxe.estore.service;

import org.adilsonufxe.estore.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @DisplayName("User object created")
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
        Assertions.assertEquals(firstName, user.getFirstName(), "User's first name is incorrect");
        Assertions.assertEquals(lastName, user.getLastName(), "User's last name is incorrect");
        Assertions.assertEquals(email, user.getEmail(), "User's email is incorrect");
        Assertions.assertNotNull(user.getId(), "User id is missing");
    }

    @DisplayName("Empty first name cause correct exception")
    @Test
    void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException() {
        // Arrange
        UserService userService = new UserServiceImpl();

        String firstName = "";
        String lastName = "any_last_name";
        String email = "any_mail@mail.com";
        String password = "any_password";
        String passwordConfirmation = "any_password";

        // Act & Assert

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(firstName, lastName, email, password, passwordConfirmation);
        });

        Assertions.assertEquals("User's first name is empty", thrown.getMessage(), "Exception error message is not correct");

    }
}
