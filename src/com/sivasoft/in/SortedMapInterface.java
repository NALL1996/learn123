package com.sivasoft.in;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapInterface {
	public static void main(String[] args) {
	TreeMap<String, Double>	t = new TreeMap<String,Double>();		
		t.put("john", new Double(76.5));
		t.put("Molley", new Double(87.3));
		t.put("Aron", new Double(78.2));
		t.put("Daisy", new Double(73.4));		
		Set<?> set = t.entrySet();		
		Iterator<?> i = set.iterator();		
		while(i.hasNext()) {
		@SuppressWarnings("rawtypes")	
		Map.Entry me = (Map.Entry)i.next();
		System.out.println(me.getKey() +" :" );
		System.out.println(me.getValue());	
		}
	System.out.println();			
	double percentage = ((Double)t.get("Molley")).doubleValue();
	t.put("Molley", new Double(percentage));
	System.out.println("Molley's aggregate :" + t.get("Molley"));	
	}
}
