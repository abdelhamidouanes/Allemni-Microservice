package com.allemni.eleve.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.allemni.eleve.bean.Eleve;

@RepositoryRestResource
public interface EleveDAO extends JpaRepository<Eleve, Long> {

	@RestResource(path = "/byGroupId")
	List<Eleve> findByIdgroupe(@Param("groupId") long id_groupe);

	@RestResource(path = "/byGroupIdPage")
	Page<Eleve> findByIdgroupe(@Param("groupId") long id_groupe, Pageable pageable);

	@RestResource(path = "/byListGroupe")
	List<Eleve> findByIdgroupeIn(@Param("groupId") List<Long> idgroupe);

	@RestResource(path = "/byListGroupePage")
	Page<Eleve> findByIdgroupeIn(@Param("groupId") List<Long> idgroupe, Pageable pageable);

}
