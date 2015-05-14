package com.kingshuk.java.j5;

import java.util.ArrayList;
import java.util.List;

public class NewLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		names.add("Ram");
		names.add("Peter");
		names.add("Khan");
		names.add("Sing");
		names.add("Tomar");
		names.add("Abdulla");

		for(String name:names)
			System.out.println(name);	
	}

}
