package org.example.DevSync2;

import org.example.DevSync2.entity.User;
import org.example.DevSync2.enums.Role;
import org.example.DevSync2.repository.UserRepository;
import org.example.DevSync2.util.HashPassword;
import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("11");

        // Hash the password before storing it
        String hashedPassword = new HashPassword().hashedPassword(user.getPassword());
        user.setPassword(hashedPassword);


        new UserRepository().findAll().forEach(user1 -> {
            System.out.println(user1.getFirstName() + " " + user1.getLastName());
            System.out.println(user1.getEmail());
            System.out.println(user1.getPassword());
            System.out.println(user1.getRole());

        });
        System.out.println("Hashed Password: " + user.getPassword());


    }

}
