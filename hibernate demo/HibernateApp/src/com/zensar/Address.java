package com.zensar;

import javax.persistence.Embeddable;

/*import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/
@Embeddable
public class Address {
	/*
	 * public int getId() { return id; }
	 * 
	 * 
	 * public void setId(int id) { this.id = id; }
	 */




	/* @Id @GeneratedValue */
	
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}





	//private int id;
	private String area,city;
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	

	public static void main(String[] args) {
	}

}

