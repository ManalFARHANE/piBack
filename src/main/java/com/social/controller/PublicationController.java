package com.social.controller;

import com.social.entities.Publication;
import com.social.services.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @CrossOrigin()
    @GetMapping("/publications/{id}")
    public Publication find(@PathVariable Long id) {
        return publicationService.find(id);
    }

    @CrossOrigin()
    @PutMapping("/publications/{id}")
    public Publication update(@PathVariable(name = "id") Long id ,@RequestBody Publication publication)   {
        return publicationService.update(id, publication);
    }

    @CrossOrigin()
    @GetMapping("/publications")
    public List<Publication> GetAllPublication(){
        return publicationService.GetAllPublication();}
    @CrossOrigin()
    @PostMapping("/publications")
    public Publication save(@RequestBody Publication publication){ return publicationService.save(publication);}

}
