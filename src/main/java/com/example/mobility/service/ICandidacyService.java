package com.example.mobility.service;


import com.example.mobility.model.Candidacy;
import com.example.mobility.model.User;

import java.util.Date;
import java.util.List;

public interface ICandidacyService {


    void add(Candidacy candidacy, Long idU);
    void  updateCandidacy (Candidacy candidacy);
    void  deleteCandidacy(Integer idCandidacy);
    List<Candidacy> GetCandidacy();
    void addUser (User user);

    List<Candidacy> listAllCandidacy(String keyword);



}
