package com.projetPfa.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetPfa.Beans.Navire;
import com.projetPfa.Services.NavireService;

@CrossOrigin(origins = "http://localhost:3306/")
@RestController
@RequestMapping("/api/navires")
public class NavireWebService {
	@Autowired
	NavireService navireService;
	
	
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
	public List<Navire> findAll(){
		return navireService.findAll();
	}
	
	@GetMapping("/find/email/{id}")
	public Navire findById(@PathVariable Long id){
		return navireService.findById(id);
	}
}
