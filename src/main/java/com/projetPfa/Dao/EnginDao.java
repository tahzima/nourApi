package com.projetPfa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetPfa.Beans.Engin;


@Repository
public interface EnginDao extends JpaRepository<Engin, Long>{

}
