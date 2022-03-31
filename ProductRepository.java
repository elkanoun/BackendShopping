package com.infokmed.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.infokmed.entities.Product;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
    //the method of search the products by keyword
    @RestResource(path = "/productsByKeyword")
    public List<Product> findByNameContains(@Param("mc") String mc);

    //the method of search the products by keyword
    @RestResource(path = "/productsBySubCategoryId")
    public List<Product> findAllBySubCategoryId(@Param("id") Long id);
    
    /*
    //the method of products in promotion
    @RestResource(path = "/productsInPromotion")
    public List<Product> findByPromotionNotNull();
    
    //the method of products indisponibles in stock
    @RestResource(path = "/productsIndisponibleInStock")
    public List<Product> findByQuantityNull();
    */

    
   
    
    
}
