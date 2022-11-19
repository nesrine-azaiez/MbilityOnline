package com.example.mobility.repo;


import com.example.mobility.model.Candidacy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoCandidacy extends CrudRepository<Candidacy,Integer> {


      @Query("SELECT c  FROM Candidacy c WHERE CONCAT(c.dateOfCandidacy,c.status) LIKE %?1%")
     List<Candidacy> findAll(String keyword);

    @Query(value = "select c from Candidacy c where concat(c.idCandidacy,c.status,c.genre,c.type,c.nationality,c.nom,c.prenom,c.filiere,c.annee,c.etablissementOrigine,c.etablissementOrigine,c.programme,c.dateN,c.usersW) like %?1% group by c ")
    List<Candidacy> searchmultilplcandidacy(String keyword);

}