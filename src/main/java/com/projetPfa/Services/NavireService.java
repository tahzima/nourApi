package com.projetPfa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetPfa.Beans.Navire;
import com.projetPfa.Dao.NavireDao;

@Service
public class NavireService {
	@Autowired
	NavireDao navireDao;
	
	/*public Boolean create(Commande commande) {

		Boolean test = false;
	
		if (commandeDao.save(commande) != null) {
			test = true;
		}
	
		return test;
	}
	
	public Boolean update(Commande commande) {
	
		Boolean test = false;
	
		if (this.findById(commande.getId()) != null) {
			commandeDao.save(commande);
			test = true;
		}
	
		return test;
	}
	
	public Boolean delete(Long id) {
	
		Boolean test = false;
	
		if (this.findById(id) != null) {
			commandeDao.deleteById(id);
			test = true;
		}
	
		return test;
	}*/
	
	public Navire findById(Long id) {
		return navireDao.getById(id);
	}
	
	public List<Navire> findAll() {
		return navireDao.findAll();
	}
}
