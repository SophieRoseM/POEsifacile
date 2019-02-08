package com.POEsifacile.java.controller;



import com.POEsifacile.java.model.IdentifiantScore;
import com.POEsifacile.java.model.utilisateur;
import com.POEsifacile.java.service.POEservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PoeControl {

    @Autowired
    private POEservice poEservice;


    @RequestMapping("/gethistoriqueUtilisateur") // renvoi un utilisateur avec tout son historique
    public utilisateur u(@RequestParam(value="id") Integer id) throws Exception {
        return poEservice.recupereutilisateur(id);

    }


    @RequestMapping("/gethistoriqueUtilisateurs") // renvoi le pseudo avec tout ses scores
    public List<IdentifiantScore> getScores() throws Exception {
        return poEservice.recuperetouslesutilisateur();

    }

}
