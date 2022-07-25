package com.projetPfa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetPfa.Beans.Utilisateur;


@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long>{

}
