package com.alllemni.appel.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "registre_appel")
public class RegistreAppel implements Serializable {

	public RegistreAppel(Long idEleve, Long idSeance) {
		this.id_eleve = idEleve;
		this.id_seance = idSeance;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long id_eleve;
	private long id_seance;
	private String remarque;
	private int absent;
	private int brillant;
	private int participant;
	private int retard;
	private int creative;
	private int paresseux;
	private int timide;
	private int homework;

}
