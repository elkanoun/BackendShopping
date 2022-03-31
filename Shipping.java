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
public class Shipping implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @OneToOne
    public Country country;
    @NotNull
    @Size(max=50)
    private String zipCode;
    @NotNull
    @OneToOne
    private City city;
    @NotNull
    @Size(max=50)
    public String mode;
    @NotNull
    @Size(max=20)
    private String phone;
    @NotNull
    private Date date;
    @NotNull
    @Size(max=20)
    private String state;
    @NotNull
    @Size(max=200)
    private String address;
    //order
    @OneToOne
    Orders order;
    @NotNull
    private double frais;
    
    /*constructors */
    public Shipping() {
		// TODO Auto-generated constructor stub
	}

	public Shipping(Long id, @NotNull Country country, @NotNull @Size(max = 50) String zipCode, @NotNull City city,
			@NotNull @Size(max = 50) String mode, @NotNull @Size(max = 20) String phone, @NotNull Date date,
			@NotNull @Size(max = 20) String state, @NotNull @Size(max = 200) String address, Orders order,
			@NotNull double frais) {
		super();
		this.id = id;
		this.country = country;
		this.zipCode = zipCode;
		this.city = city;
		this.mode = mode;
		this.phone = phone;
		this.date = date;
		this.state = state;
		this.address = address;
		this.order = order;
		this.frais = frais;
	}
	/*getters and setters*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public double getFrais() {
		return frais;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}
	
    


}
