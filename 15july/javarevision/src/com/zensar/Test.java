package com.zensar;

import java.util.ArrayList;

public class Test {

	public static double calculateCustomerBill(ArrayList<Icecream> icecreams ) {
		double bill = 0.0;
		
		for(Icecream iceCream:icecreams) {
			bill = bill + (iceCream.getPrice()-iceCream.getDiscount());
		}
		
		return bill;
		
	}
	
	public static String getFlavourOfMaxPriceIcecream(ArrayList<Icecream> listOfIceCreams ) {
		Double maxPrice=0.0;
		Icecream iceCreamWithMaxPrice = null;
		for(int i=0; i<listOfIceCreams.size(); i++) {
			Icecream currentIceCream = listOfIceCreams.get(i);
			if(maxPrice<currentIceCream.getPrice()) {
				maxPrice = currentIceCream.getPrice();
				iceCreamWithMaxPrice = currentIceCream;
				
			}
		}
		
		
		return iceCreamWithMaxPrice.getFlavour();
	}
	
	public static void main(String[] args) {
		Icecream iceCream1 = new Icecream("vanilla", 45);
		Icecream iceCream2 = new Icecream("chocolate", 60);
		Icecream iceCream3 = new Icecream("pista", 55);
		Icecream iceCream4 = new Icecream("almond", 70);
		
		ArrayList<Icecream> listOfIceCreams = new ArrayList<Icecream>();
		listOfIceCreams.add(iceCream1);
		listOfIceCreams.add(iceCream2);
		listOfIceCreams.add(iceCream3);
		listOfIceCreams.add(iceCream4);
		
	//	String flavourOfMaxPriceIceCream = getFlavourOfMaxPriceIcecream(listOfIceCreams);
	//	System.out.println(flavourOfMaxPriceIceCream);
		
		double totalBillAmount = calculateCustomerBill(listOfIceCreams);
		System.out.println("Total Bill Amount: "+totalBillAmount);
		
		
		
	}
}
