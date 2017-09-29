package org.melsif.service;

import org.melsif.model.User;
import org.melsif.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fliou on 29/09/17.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        // TODO
    }
}
