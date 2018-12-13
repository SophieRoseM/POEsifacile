package com.POEsifacile.java;

import com.POEsifacile.java.model.historique;
import com.POEsifacile.java.model.utilisateur;
import com.POEsifacile.java.repository.historiquerepository;
import com.POEsifacile.java.repository.utilisateurrepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private utilisateurrepository utilisateurrepository;
	private historiquerepository historiquerepository;

	@Test
public void testConnexionBdd() {

		Assert.assertTrue(utilisateurrepository.count()>0);
	}




	@Test
	public void testComparepseudoId() {

		utilisateur u =utilisateurrepository.findOne(4);//On demande d'abord de récupérer un utilisateur entier dans le repository sur la base de son id, avec le nom spécifié dans le @autowired
		String pseudo = u.getPseudo(); //A partir de l'utilisateur récupéré, on extrait son pseudo avec le getter de base dans la classe Utilisateur
		Assert.assertTrue(pseudo.equals("aaa")); //On définit que l'assertion est vraie si le pseudo est le même que celui de l'utilisateur dans la base
	}

	@Test
	public void ajoutUtilisateur(){
		utilisateur u = utilisateurrepository.save(new utilisateur("toto","1234"));
	}







}

