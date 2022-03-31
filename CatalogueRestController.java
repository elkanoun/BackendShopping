package com.infokmed.web;


import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infokmed.dao.CategoryRepository;
import com.infokmed.dao.ProductRepository;
import com.infokmed.dao.SubCategoryRepository;
import com.infokmed.entities.Category;
import com.infokmed.entities.Product;
import com.infokmed.entities.SubCategory;

@RestController
public class CatalogueRestController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Autowired
    private ProductRepository productRepository;

    //method return photo categories
    @GetMapping(path = "/photoCategories/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhotoCategorie(@PathVariable("id") Long id) throws Exception{
        Category c=categoryRepository.findById(id).get();
        return
                Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom_master/categories/"+c.getImage()));

    }

    //method return photo subCategories
    @GetMapping(path = "/photoSubCategories/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhotoSubCategorie(@PathVariable("id") Long id) throws Exception{
        SubCategory sc=subCategoryRepository.findById(id).get();
        return
                Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom_master/subCategories/"+sc.getImage()));

    }
  //method return photo products
    @GetMapping(path = "/photoProduct/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhotoProduct(@PathVariable("id") Long id) throws Exception{
        Product p=productRepository.findById(id).get();
        return
                Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom_master/products/"+p.getImages()));

    }
}
