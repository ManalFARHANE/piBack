package com.social.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.entities.User;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

/**
 * @author kamal berriga
 *
 */
/* this the user  Repository interface  */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

public User findOneByUsername(String username);
public User findUserById(long id);

}
