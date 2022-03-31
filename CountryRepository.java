package com.infokmed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.infokmed.entities.Country;
@CrossOrigin("*")
@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Long> {

}
