package com.allemni.seance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.allemni.seance.bean.Seance;

@RepositoryRestResource
public interface SeanceDAO extends JpaRepository<Seance, Long> {

}
