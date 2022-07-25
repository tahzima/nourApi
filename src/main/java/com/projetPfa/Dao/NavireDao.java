package com.projetPfa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetPfa.Beans.Navire;


@Repository
public interface NavireDao extends JpaRepository<Navire, Long>{

}
