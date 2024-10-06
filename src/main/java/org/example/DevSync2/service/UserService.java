package org.example.DevSync2.service;

import org.example.DevSync2.entity.User;
import org.example.DevSync2.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public boolean save(User user) {
        return userRepository.save(user);
    }

    public boolean update(User user) {
        return userRepository.update(user);
    }

    public boolean delete(Long id) {
        return userRepository.delete(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
