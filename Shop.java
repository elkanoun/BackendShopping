package com.infokmed.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import java.io.Serializable;



@Data
@Entity
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;


    @Id
    ShopId pk;

    @NotNull
    @DecimalMax(value="11")
    private int quantity;
    
    //constructors
    public Shop() {
		// TODO Auto-generated constructor stub
	}

	public Shop(ShopId pk, @NotNull @DecimalMax("11") int quantity) {
		super();
		this.pk = pk;
		this.quantity = quantity;
	}
    //getters and setters

	public ShopId getPk() {
		return pk;
	}

	public void setPk(ShopId pk) {
		this.pk = pk;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	



}
