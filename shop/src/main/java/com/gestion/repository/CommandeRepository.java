package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gestion.model.Commande;

@RepositoryRestResource
@CrossOrigin("*")
public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
