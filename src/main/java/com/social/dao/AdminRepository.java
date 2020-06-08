package com.social.dao;

import com.social.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findOneByUsername(String username);
}
