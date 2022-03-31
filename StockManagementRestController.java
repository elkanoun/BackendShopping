package com.infokmed.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infokmed.dao.CategoryRepository;
import com.infokmed.dao.DomainRepository;
import com.infokmed.dao.ProductRepository;
import com.infokmed.dao.SubCategoryRepository;
import com.infokmed.entities.Category;
import com.infokmed.entities.Domain;
import com.infokmed.entities.Product;
import com.infokmed.entities.SubCategory;

@RestController
@CrossOrigin("*")
public class StockManagementRestController {
	@Autowired
	DomainRepository domainRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	SubCategoryRepository subCategoryRepository;
	@Autowired
	ProductRepository productRepository;
	
	 /*Methods of management domains*/
	//search domain by id
	@GetMapping("/show_domain/{id}")
	public Domain getDomain(@PathVariable Long id) {
		return domainRepository.getOne(id);
	}
	//add domain
	@PostMapping("/add_domain")
	public Domain saveDomain(@RequestBody Domain domain) {
		return domainRepository.save(domain);
	}
	//update domain
	@PutMapping("/update_domain")
	public Domain updateDomain(@RequestBody Domain domain) {
		return domainRepository.save(domain);
	}
	//delete domain
	@DeleteMapping("/delete_domain/{id}")
	public boolean deletDomain(@PathVariable Long id) {
		domainRepository.deleteById(id);
		return true;
	}
	
	/*Methods of management Categories*/
	
	//search category by id
	@GetMapping("/show_category/{id}")
	public Category getCategory(@PathVariable Long id) {
		return categoryRepository.getOne(id);
	}
	//add category
	@PostMapping("/add_category")
	public Category addCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}
	//update category
	@PutMapping("/update_category")
	public Category updateCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}
	//delete category
	@DeleteMapping("/delete_category/{id}")
	public boolean deleteCategory(@PathVariable Long id) {
		categoryRepository.deleteById(id);
		return true;
	}
	
/*Methods of management subCategories*/
	
	//search subCategory by id
	@GetMapping("/show_subCategory/{id}")
	public Category getSubCategory(@PathVariable Long id) {
		return categoryRepository.getOne(id);
	}
	//add subCategory
	@PostMapping("/add_subCategory")
	public SubCategory addSubCategory(@RequestBody SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}
	//update subCategory
	@PutMapping("/update_subCategory")
	public SubCategory updateSubCategory(@RequestBody SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}
	//delete subCategory
	@DeleteMapping("/delete_subCategory/{id}")
	public boolean deleteSubCategory(@PathVariable Long id) {
		subCategoryRepository.deleteById(id);
		return true;
	}
	
	  /*Methods of management products*/
	//get product by id
	@GetMapping("/show_product/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productRepository.getOne(id);
	}
	//add product
	@PostMapping("/add_product")
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	//update product
	@PutMapping("/update_product")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	//delete product
	@DeleteMapping("/delete_product/{id}")
	public boolean deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
		return true;
	}
	
}
