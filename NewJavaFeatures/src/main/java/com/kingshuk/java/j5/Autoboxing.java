package com.kingshuk.java.j5;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer age=31;											// Autoboxing
		List<Double> weights=new ArrayList<Double>();
		weights.add(64.5);										// Autoboxing
		weights.add(73.2);										// Autoboxing
		
		if(age < 31)											// Unboxing
			System.out.println("Below thirty");
		
		double totalWeight=weights.get(0)+weights.get(1);
		System.out.println("total weights: "+totalWeight);
		
		

	}

}
