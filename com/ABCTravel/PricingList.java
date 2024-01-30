package com.ABCTravel;

import java.util.*;
public class PricingList {
	public HashMap<String,Integer> prices(){
	HashMap<String ,Integer> hp=new HashMap<>();
	hp.put("hyderabadbangalore", 2000);
	hp.put("hyderabadchennai", 2200);
	hp.put("hyderabadarmoor", 200);
	hp.put("hyderabadvijaywada", 2050);
	hp.put("hyderabadmumbai", 5000);
	hp.put("bangalorearmoor", 2500);
	hp.put("bangalorechennai", 1000);
	hp.put("bangalorewarangal", 2000);
	hp.put("bangalorevijaywada", 2300);
	hp.put("bangalorenizamabad", 1800);
	hp.put("bangalorehyderabad", 2000);
	hp.put("bangaloremumbai", 5100);
	hp.put("chennaibangalore", 1800);
	hp.put("chennaihyderabad", 3000);
	hp.put("chennaimumbai", 5600);
	hp.put("armoorbangalore", 1500);
	
	
	
	return hp;
	}

}
