package com.infokmed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date date;

    //customer
    @ManyToOne
    private Customer customer;
    
    @NotNull
    private double price;

    //products-shop
    @OneToMany(mappedBy = "pk.order")
    private Collection<Shop> shops;
    
    //constructors
    public Orders() {
		// TODO Auto-generated constructor stub
	}
    public Orders(Long id, @NotNull Date date, Customer customer, @NotNull double price, Collection<Shop> shops) {
		super();
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.price = price;
		this.shops = shops;
	}
	
    //getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<Shop> getShops() {
		return shops;
	}

	public void setShops(Collection<Shop> shops) {
		this.shops = shops;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    

}
