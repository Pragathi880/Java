package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Products {
    private String name;
    private String quantity;
    private boolean procuctDelivered;
    private float rating;
	public Products(String name, String quantity, boolean procuctDelivered, float rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.procuctDelivered = procuctDelivered;
		this.rating = rating;
	}
    

}
