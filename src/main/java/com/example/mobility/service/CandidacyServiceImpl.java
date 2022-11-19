package com.example.mobility.service;

import com.example.mobility.model.*;


import com.example.mobility.repo.RepoCandidacy;
import com.example.mobility.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class CandidacyServiceImpl implements ICandidacyService{

    @Autowired
    private RepoCandidacy repoCandidacy;
    @Autowired
    private UserRepository repoUser;

    @Override
    public void add(Candidacy candidacy,  Long idU) {

        User user = repoUser.findById(idU).orElse(null);

        candidacy.setUsersW(user);
      //  sendEmailService.sendSimpleEmail(user.getEmail(), "your interview will take place on April 3: ", " Interview Response");
        repoCandidacy.save(candidacy);
    }

    @Override
    public void updateCandidacy(Candidacy candidacy) {
        repoCandidacy.save(candidacy);
    }

    @Override
    public void deleteCandidacy(Integer idCandidacy) {
        Candidacy candidacy1 = repoCandidacy.findById(idCandidacy).orElse(null);
        repoCandidacy.delete(candidacy1);
    }

    @Override
    public List<Candidacy> GetCandidacy() {
        List<Candidacy> candidacy = (List<Candidacy>) repoCandidacy.findAll();
        return  candidacy;
    }

    @Override
    public void addUser(User user) {
        repoUser.save(user);
    }

    @Override
    public List<Candidacy> listAllCandidacy(String keyword) {
        if (keyword != null) {
            return  repoCandidacy.findAll(keyword);
        }
        return (List<Candidacy>) repoCandidacy.findAll();
    }

    @Override
    public List<Candidacy> SearchCandidacyMultiple(String key) {

        if (key.equals(""))
        {
            return (List<Candidacy>) repoCandidacy.findAll();
        }else
        {
            return repoCandidacy.searchmultilplcandidacy(key);
        }

    }
    public Candidacy getCandidacyById(int idCandidacy) {
        return repoCandidacy.findById(idCandidacy).get();
    }



}

