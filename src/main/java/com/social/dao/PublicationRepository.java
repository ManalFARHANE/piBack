package com.social.dao;

import com.social.entities.Publication;
import com.social.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
