package com.POEsifacile.java.service;

import com.POEsifacile.java.model.IdentifiantScore;
import com.POEsifacile.java.model.utilisateur;
import com.POEsifacile.java.repository.historiquerepository;
import com.POEsifacile.java.repository.utilisateurrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class POEservice {

// pour chaque joueur affiche score de chaque salle

    @Autowired
    private utilisateurrepository utilisateurrepository;
    @Autowired
    private historiquerepository historiquerepository;



    public utilisateur recupereutilisateur(Integer id ) throws Exception{
        if (utilisateurrepository.exists(id)){
           return utilisateurrepository.findById(id);
        }else{
            throw new Exception("l'id n'existe pas!");
        }
    }

    public List<IdentifiantScore> recuperetouslesutilisateur() {
        //List identifiant score
        
        //Recupere tous les utilisateurs

        //pour chaque utilisateur, tu construis un identifiantscore que tu ajoutes dans ta liste

        //tu retournes ta liste
        return null;
    }


//public IdentifiantScore recuperepseudo(String pseudo)throws Exception{
//        if( identifiantrepository.exists(pseudo)) {
//        return identifiantrepository.findbyPseudoAndScore(pseudo, score);
//            } else {
//            throw new Exception("le pseudo n'existe pas");
//
//        }
//}
}