package com.example.mobility.cotroller;


import com.example.mobility.model.Candidacy;
import com.example.mobility.model.User;
import com.example.mobility.service.ICandidacyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CandidacyController {
    @Autowired
    private ICandidacyService iServices;

    @RequestMapping(value = {"/addCandidacy/{idUser}"}, method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "Ajouter un candidat  ")
    public void addCandidacy(@RequestBody Candidacy candidacy,@PathVariable(name = "idUser") Long idU)
    {
        iServices.add(candidacy, idU);
    }
    @DeleteMapping("/deleteCandidacy")
    @ResponseBody
    @ApiOperation(value = "Update Candidacy ")
    public void deleteCandidacy(Integer id) {
        iServices.deleteCandidacy(id);
    }

    @PutMapping(value = {"/updateCandidacy}"})
    @ResponseBody
    @ApiOperation(value = " update candidacy  ")
    public void updateCandidacy(@RequestBody Candidacy candidacy) {
        iServices.updateCandidacy(candidacy);
    }


    @GetMapping("/GetCandidacy")
    @ResponseBody
    @ApiOperation(value = "Get Candidacy ")
    public List<Candidacy> GetCandidacy() {
        return iServices.GetCandidacy();
    }

    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "ajouter User  ")
    public void addCUser(@RequestBody User user){
        iServices.addUser(user);
    }

    @GetMapping("/SearchCandidacy/{keyword}")
    @ResponseBody
    @ApiOperation(value = "search candidacy ")
    public List<Candidacy> SearchCandidacy( @PathVariable("keyword") String keyword) {
        List<Candidacy> listCandidacy = iServices.listAllCandidacy(keyword);
        return  listCandidacy;
    }

    @ApiOperation(value = " Search Candidacy Multiple  ")
    @GetMapping("/SearchMultiple/{keyword}")
    @ResponseBody
    public List<Candidacy> SearchCandidacyMultiple(@PathVariable("keyword")  String key){
        return  iServices.SearchCandidacyMultiple(key);

    }
    @ApiOperation(value = "get candidacy by id")
    @GetMapping("/getCandidacyById/{idCandidacy}")
    public Candidacy getCandidacyById(@PathVariable(name = "idCandidacy") Integer idCandidacy)
    {
        return iServices.getCandidacyById(idCandidacy);
    }


}
