package com.infokmed;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.infokmed.entities.Brand;
import com.infokmed.entities.Category;
import com.infokmed.entities.City;
import com.infokmed.entities.Country;
import com.infokmed.entities.Customer;
import com.infokmed.entities.Domain;
import com.infokmed.entities.Orders;
import com.infokmed.entities.Payment;
import com.infokmed.entities.Product;
import com.infokmed.entities.Property;
import com.infokmed.entities.Shipping;
import com.infokmed.entities.Shop;
import com.infokmed.entities.SubCategory;


@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    
   
    public static void main(String[] args)  {
        SpringApplication.run(EcommerceApplication.class, args);

    }

    

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Domain.class, Brand.class, Category.class, SubCategory.class, Product.class, 
        		                                 Country.class, City.class, Customer.class, Orders.class, Shipping.class,
        		                                 Payment.class, Property.class, Shop.class);
        
      
        
        
    }
}
