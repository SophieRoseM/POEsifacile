package com.POEsifacile.java.repository;


import com.POEsifacile.java.model.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface utilisateurrepository extends JpaRepository<utilisateur, Integer> {

    utilisateur findById(Integer id);


}
