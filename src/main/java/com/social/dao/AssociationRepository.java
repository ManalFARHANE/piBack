package com.social.dao;

import com.social.entities.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssociationRepository extends JpaRepository<Association, Integer> {
    public Association findOneByLogin(String login);


}
