package com.ABCTravel;

import java.util.HashMap;

public class SeatsAvailable {
	HashMap<String ,Integer> hp=new HashMap<>();
	
	public HashMap<String,Integer> seats(){
		
		hp.put("hyderabadbangalore", 20);
		hp.put("hyderabadchennai", 22);
		hp.put("hyderabadarmoor", 30);
		hp.put("hyderabadvijaywada", 50);
		hp.put("hyderabadmumbai", 30);
		hp.put("bangalorearmoor", 25);
		hp.put("bangalorechennai", 10);
		hp.put("bangalorewarangal", 20);
		hp.put("bangalorevijaywada", 23);
		hp.put("bangalorenizamabad", 18);
		hp.put("bangalorehyderabad", 20);
		hp.put("bangaloremumbai", 20);
		hp.put("chennaibangalore", 10);
		hp.put("chennaihyderabad", 30);
		hp.put("chennaimumbai", 26);
		hp.put("armoorbangalore", 15);
		
		
		return hp;

	}
	public void setSeats(HashMap<String,Integer> ss) {
		hp.putAll(ss);
	}
}
