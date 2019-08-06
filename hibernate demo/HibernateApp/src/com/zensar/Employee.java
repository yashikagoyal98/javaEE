package com.zensar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Employee
{
	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + ", salary=" + salary + ", address=" + address + "]"; }
	 */
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	@Id
	private int id;
	private String name;
	private double salary;
	/* private Address address; */
	@OneToMany
	/* private Laptop laptop; */
	
	/*
	 * private List<Laptop> laptops=new ArrayList<Laptop>();
	 * 
	 * public List<Laptop> getLaptops() { return laptops; } public void
	 * setLaptops(List<Laptop> laptops) { this.laptops = laptops; }
	 */
	/*
	 * public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
