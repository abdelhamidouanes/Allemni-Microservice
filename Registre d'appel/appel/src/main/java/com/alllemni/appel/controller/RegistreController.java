package com.alllemni.appel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alllemni.appel.DAO.RegistreDAO;
import com.alllemni.appel.bean.RegistreAppelPerSeance;
import com.alllemni.appel.bean.RegistreAppel;

@RestController
public class RegistreController {

	@Autowired
	RegistreDAO registreDAO;

	@PostMapping(value = "/saveEleveRegistreAppel")
	void saveEleveRegistreAppel(@RequestBody RegistreAppelPerSeance registreappel) {
		RegistreAppel registre;
		for (Long idEleve : registreappel.getIdEleves()) {
			registre = new RegistreAppel(idEleve, registreappel.getIdSeance());
			registreDAO.save(registre);
		}
	}
}
