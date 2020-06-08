package com.social.services;

import com.social.dao.PublicationRepository;
import com.social.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PublicationService {
    @Autowired
    PublicationRepository publicationRepository;


    public Publication find(Long id) {
        return publicationRepository.findOne(id);
    }
    public Publication update(Long id, Publication publication) {
        publication.setId(id);
        return publicationRepository.save(publication);
    }
    public Publication save(Publication publication) {
        return publicationRepository.save(publication);
    }


    public List<Publication> GetAllPublication(){
        return publicationRepository.findAll();}
}
