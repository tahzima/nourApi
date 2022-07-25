package com.projetPfa.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetPfa.Beans.Engin;
import com.projetPfa.Services.EnginService;

@CrossOrigin(origins = "http://localhost:3306/")
@RestController
@RequestMapping("/api/engins")
public class EnginWebService {
	@Autowired
	EnginService enginService;
	
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
	public List<Engin> findAll(){
		return enginService.findAll();
	}
	
	@GetMapping("/find/email/{id}")
	public Engin findById(@PathVariable Long id){
		return enginService.findById(id);
	}
}
