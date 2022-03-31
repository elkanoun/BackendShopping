package com.infokmed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max=50)
    private String firstName;
    @NotNull
    @Size(max=50)
    private String lastName;
    @NotNull
    @Size(max=20)
    private String phone;
    @NotNull
    @Size(max=200)
    private String address;
    @Email
    private String email;
    @NotNull
    @Size(max=1)
    private char sex;

    //orders
    @OneToMany(mappedBy = "customer",fetch=FetchType.LAZY)
    private Collection<Orders> orders;
    
    //constructors
    public Customer() {
		// TODO Auto-generated constructor stub
	}

	
    public Customer(@NotNull @Size(max = 50) String firstName, @NotNull @Size(max = 50) String lastName,
			@NotNull @Size(max = 20) String phone, @NotNull @Size(max = 200) String address, @Email String email,
			@NotNull @Size(max = 1) char sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.sex = sex;
	}


	//getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Collection<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Collection<Orders> orders) {
		this.orders = orders;
	}
	
    


}
