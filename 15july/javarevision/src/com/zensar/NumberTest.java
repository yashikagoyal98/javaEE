package com.zensar;

import java.util.ArrayList;

public class NumberTest {

	public static void main(String[] args) {
	ArrayList<Double> list=new ArrayList<Double>();
	list.add(25.70);
	list.add(16.25);
	list.add(45.85);
	list.add(35.5);
	list.add(12.25);
	int  sum=0;
	for(Double i:list)
	{
		sum+=i;
	}
	double avg=sum/list.size();
	System.out.println("average=" +avg);
	

	}

}
