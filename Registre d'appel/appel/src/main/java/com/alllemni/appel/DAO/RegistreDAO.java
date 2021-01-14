package com.alllemni.appel.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alllemni.appel.bean.RegistreAppel;

@RepositoryRestResource
public interface RegistreDAO extends JpaRepository<RegistreAppel, Long> {

}
