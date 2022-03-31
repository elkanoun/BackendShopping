package com.infokmed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date date;
    @NotNull
    @Size(max=50)
    private String mode;
    @NotNull
    private double totalPrice;

    //order
    @OneToOne
    private Orders order;
    
    //constructors
    public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(Long id, @NotNull Date date, @NotNull @Size(max = 50) String mode, @NotNull double totalPrice,
			Orders order) {
		super();
		this.id = id;
		this.date = date;
		this.mode = mode;
		this.totalPrice = totalPrice;
		this.order = order;
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

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	


}
