package org.melsif.repository;

import org.melsif.model.User;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by fliou on 28/09/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
