package com.zensar;

import java.util.ArrayList;

public class Iterate {

	public static void main(String[] args) {
		double num = 0;
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(12.0);
		list.add(13.0);
		list.add(14.0);
		list.add(15.0);
		
	
for(int i=0;i<list.size();i++)
{
if((num>12.0) && (num<14.0))
{
	Double incrementedValue=num+2.5;
			list.set(i,incrementedValue);
}
	}
for(Double i:list)
{
	System.out.println(i);
}
	}
	}
