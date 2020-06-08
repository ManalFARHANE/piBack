package com.social.services;

import com.social.dao.BenevolRepository;
import com.social.entities.Benevol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BenevolService {
    @Autowired
    BenevolRepository benevolRepository;
    public Benevol save(Benevol benevol) {
        return benevolRepository.save(benevol);
    }

  public Benevol  find(String login) {
        return benevolRepository.findOneByLogin(login);
    }
    public Benevol  find(int id) {
        return benevolRepository.findOne(id);
    }

    public List<Benevol> GetAllBenevol(){
        return benevolRepository.findAll();}
    public Benevol update(int id, Benevol benevol) {
        benevol.setId_ben(id);
        return benevolRepository.save(benevol);}

    public void DeleteBenevole(int id){
        benevolRepository.delete(id);
    }

}
