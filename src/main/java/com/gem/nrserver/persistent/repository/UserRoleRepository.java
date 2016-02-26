package com.gem.nrserver.persistent.repository;


import com.gem.nrserver.persistent.model.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kimtung on 2/17/16.
 */
public interface UserRoleRepository extends CrudRepository<UserRole, String> {
    @Query("select r.role from UserRole r where r.user.username = ?")
    List<String> findByUsername(String username);
}