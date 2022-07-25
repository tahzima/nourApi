package com.projetPfa.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetPfa.Beans.Utilisateur;
import com.projetPfa.Services.UtilisateurService;

@CrossOrigin(origins = "http://localhost:3306/")
@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurWebService {
	@Autowired
	UtilisateurService utilisateurService;
	
	/*@PostMapping
	public Boolean create(@RequestBody Engin engin) {
		return enginService.create(engin);
	}

	@PutMapping("/update")
	public Boolean update(@RequestBody Engin engin) {
		return enginService.update(engin);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable Long id) {
		return enginService.delete(id);
	}*/
	
	@GetMapping
	public List<Utilisateur> findAll(){
		return utilisateurService.findAll();
	}
	
	@GetMapping("/find/email/{id}")
	public Utilisateur findById(@PathVariable Long id){
		return utilisateurService.findById(id);
	}
}
