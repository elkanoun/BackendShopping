package com.infokmed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max=100)
    private String name;
    @NotNull
    @Size(max=100)
    private String reference;
    @NotNull
    private double currentPrice;
    @Size(max=500)
    private String images;
    @NotNull
    @DecimalMin(value = "0")
    @DecimalMax(value = "100")
    private int promotion;
    @NotNull
    private double weight;
    @Size(max=500)
    private String description;
    @NotNull
    private int quantity;
    @NotNull
    private double purchasePrice;


    //subCategory
    @ManyToOne
    private SubCategory subCategory;

    //Brand
    @ManyToOne
    Brand brand;
    

    //class association: productProperties
    @ManyToMany
    @JoinTable(name = "product_properties",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "property_id")})
    private Collection<Property> properties;

    //order-shop
    @OneToMany(mappedBy = "pk.product")
    private Collection<Shop> shops;
    
    //constructors
    public Product() {
		// TODO Auto-generated constructor stub
	}
 
	public Product(Long id, @NotNull @Size(max = 100) String name, @NotNull @Size(max = 100) String reference,
			@NotNull double currentPrice, @Size(max = 500) String images,
			@NotNull @DecimalMin("0") @DecimalMax("100") int promotion, @NotNull double weight,
			@Size(max = 500) String description, @NotNull int quantity, @NotNull double purchasePrice,
			SubCategory subCategory, Brand brand, Collection<Property> properties, Collection<Shop> shops) {
		super();
		this.id = id;
		this.name = name;
		this.reference = reference;
		this.currentPrice = currentPrice;
		this.images = images;
		this.promotion = promotion;
		this.weight = weight;
		this.description = description;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.subCategory = subCategory;
		this.brand = brand;
		this.properties = properties;
		this.shops = shops;
	}

	//get and set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Collection<Property> getProperties() {
		return properties;
	}

	public void setProperties(Collection<Property> properties) {
		this.properties = properties;
	}

	public Collection<Shop> getShops() {
		return shops;
	}

	public void setShops(Collection<Shop> shops) {
		this.shops = shops;
	}
    
    
    




}
