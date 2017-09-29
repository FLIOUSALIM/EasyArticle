package org.melsif.repository;

import org.melsif.model.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fliou on 29/09/17.
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByRole(String role);
}
