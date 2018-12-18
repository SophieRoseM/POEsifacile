package com.POEsifacile.java.service;

import com.POEsifacile.java.model.IdentifiantScore;
import com.POEsifacile.java.model.utilisateur;
import com.POEsifacile.java.repository.historiquerepository;
import com.POEsifacile.java.repository.utilisateurrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service

public class POEservice {



    @Autowired
    private utilisateurrepository utilisateurrepository;
    @Autowired
    private historiquerepository historiquerepository;


// verifie si l'id existe
    public utilisateur recupereutilisateur(Integer id ) throws Exception{
        if (utilisateurrepository.exists(id)){
           return utilisateurrepository.findById(id);
        }else{
            throw new Exception("l'id n'existe pas!");
        }
    }
//
    public  List<IdentifiantScore> recuperetouslesutilisateur() { // cree une liste avec les pseudo et les scores
        //List identifiant score
        List<IdentifiantScore> recupid = new ArrayList <>();
        //Recupere tous les utilisateurs
        List<utilisateur> recuputilisateur = utilisateurrepository.findAll();

        //pour chaque utilisateur, tu construis un identifiantscore que tu ajoutes dans ta liste
        for ( utilisateur i : recuputilisateur ){

            //cree un identifiant pour chaque i
            //le mettre dans la liste
            //refaire une boucle for avec les historiques
        }
        //tu retournes ta liste
        return recupid;
    }



}