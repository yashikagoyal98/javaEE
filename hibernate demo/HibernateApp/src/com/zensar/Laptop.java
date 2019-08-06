package com.zensar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	


	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	@Id
	private int id;
	private String manufacturer;
	@ManyToOne
	private Employee e;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub


	}

}
