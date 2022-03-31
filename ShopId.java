package com.infokmed.entities;

import lombok.Data;


import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class ShopId implements Serializable {
	private static final long serialVersionUID = 1L;


    @ManyToOne
    private Orders order;

    @ManyToOne
    private Product product;
    
    //constructors
    public ShopId() {
		// TODO Auto-generated constructor stub
	}

	public ShopId(Orders order, Product product) {
		super();
		this.order = order;
		this.product = product;
	}
    


}
