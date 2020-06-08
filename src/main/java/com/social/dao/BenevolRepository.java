package com.social.dao;

import com.social.entities.Benevol;
import com.social.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
public interface BenevolRepository extends JpaRepository<Benevol, Integer> {
   public Benevol findOneByLogin(String login);

}
