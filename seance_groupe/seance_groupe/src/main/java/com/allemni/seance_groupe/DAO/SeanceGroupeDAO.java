package com.allemni.seance_groupe.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.allemni.seance_groupe.bean.SeanceGroupe;

@RepositoryRestResource
public interface SeanceGroupeDAO extends JpaRepository<SeanceGroupe, Long> {

	@RestResource(path = "/byIdSeance")
	List<SeanceGroupe> findByIdseance(@Param("idseance") long idsenace);
}
