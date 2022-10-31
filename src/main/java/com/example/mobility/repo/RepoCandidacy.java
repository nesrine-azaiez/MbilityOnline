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


}