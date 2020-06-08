package com.social.services;

import com.social.dao.AssociationRepository;
import com.social.entities.Association;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AssociationService {
    @Autowired
    AssociationRepository associationRepository;
    public Association find(String login) {
        return associationRepository.findOneByLogin(login);
    }


    public List<Association> GetAllAssociation(){
        return associationRepository.findAll();}

    public void DeleteAssociation(int id){
        associationRepository.delete(id);
    }

    public Association save(Association association) {
        return associationRepository.save(association);
    }
    public Association update(int id, Association association) {
        association.setId_asso(id);
        return associationRepository.save(association);
    }

    public Association find(int id){
        return associationRepository.findOne(id);
    }




}
