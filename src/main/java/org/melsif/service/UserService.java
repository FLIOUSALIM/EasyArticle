package org.melsif.service;

import org.melsif.model.User;

/**
 * Created by fliou on 29/09/17.
 */
public interface UserService {

    public User findUserByUsername(String username);

    public void saveUser(User user);
}
