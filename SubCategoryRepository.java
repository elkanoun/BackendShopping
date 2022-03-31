package com.infokmed.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.infokmed.entities.SubCategory;


@CrossOrigin("*")
@RepositoryRestResource
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

}
