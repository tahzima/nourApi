package com.projetPfa.Beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Navire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateArrivee;
	private String marchandise;
	private String nomNavire;
	private String numeroNavire;
	private String status;
	
	public Navire() {
		super();
	}

	public Navire(Date dateArrivee, String marchandise, String nomNavire, String numeroNavire, String status) {
		super();
		this.dateArrivee = dateArrivee;
		this.marchandise = marchandise;
		this.nomNavire = nomNavire;
		this.numeroNavire = numeroNavire;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getMarchandise() {
		return marchandise;
	}

	public void setMarchandise(String marchandise) {
		this.marchandise = marchandise;
	}

	public String getNomNavire() {
		return nomNavire;
	}

	public void setNomNavire(String nomNavire) {
		this.nomNavire = nomNavire;
	}

	public String getNumeroNavire() {
		return numeroNavire;
	}

	public void setNumeroNavire(String numeroNavire) {
		this.numeroNavire = numeroNavire;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
