package com.social.controller;

import com.social.dao.AssociationRepository;
import com.social.entities.Association;
import com.social.services.AssociationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssociationController {
    public static final Logger logger = LoggerFactory.getLogger(AssociationController.class);
    @Autowired
    private AssociationService associationService;
    private AssociationRepository associationRepository;
    @CrossOrigin()
    @GetMapping("/associations")
    public List<Association> GetAllAssociation(){
        return associationService.GetAllAssociation();}

    @CrossOrigin()
    @GetMapping(value = "/associations/{id}")
    public Association find(@PathVariable int id) { return associationService.find(id);
    }

    @CrossOrigin()
    @GetMapping("/association/{login}")
    public Association find(@PathVariable String login) { return associationService.find(login);
    }


    @CrossOrigin()
    @PutMapping (value = "/associations/{id}")
    public Association update(@PathVariable(name = "id") int id, @RequestBody Association association){
        association.getId_asso();
        return associationService.update(id, association);
    }

    @CrossOrigin()
    @PostMapping("/associations")
    public Association save(@RequestBody Association association){ return associationService.save(association);}

    @CrossOrigin()
    @DeleteMapping("/associations/{id}")
    public void delete(@PathVariable(name = "id") Integer id){
        associationService.DeleteAssociation(id);
    }

}
