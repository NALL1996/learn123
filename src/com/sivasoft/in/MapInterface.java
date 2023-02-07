package com.sivasoft.in;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {

	Map<Integer, String> map = new HashMap<Integer,String >(); 	
	map.put(1, "Cricket");
	map.put(3, "Hockey");
	map.put(2, "Archery");
//	map.put(3, "Kabaddi");
//	map.put(4, "Archery");
	for(Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
		Entry<Integer, String> m = iterator.next();
	//	System.out.println(m.getKey()+" "+m.getValue());
    Map<Integer, String> syncMap = Collections.synchronizedMap(map);	
//	System.out.println(syncMap);	
	}
	
	Map<String, String> mapLang = new TreeMap<>();	 
	mapLang.put(".c", "C");
	mapLang.put(".java", "Java");
	mapLang.put(".pl", "Perl");
	mapLang.put(".cs", "C#");
	mapLang.put(".php", "PHP");
	mapLang.put(".cpp", "C++");
	mapLang.put(".xml", "XML");	 
	System.out.println(mapLang);
	
	
	Map<String, String> mapContacts = new LinkedHashMap<>();	 
	mapContacts.put("0169238175", "Tom");
	mapContacts.put("0904891321", "Peter");
	mapContacts.put("0945678912", "Mary");
	mapContacts.put("0981127421", "John");	 
//	System.out.println(mapContacts);
	
	Map<Integer, String > maps = new HashMap<Integer ,String >(); 	
	maps.put(403, "Forbidden");
	maps.put(404, "Not Found");
	maps.put(500, "Internal Server Error");	 
	for(Iterator<Entry<Integer,String>> iterator = maps.entrySet().iterator(); iterator.hasNext();) {
		Entry<Integer, String> m2 = iterator.next();
		Map<Integer, String> syncMap2 = Collections.synchronizedMap(maps);
	//	System.out.println(m2.getKey()+" "+m2.getValue());
	//	System.out.println(maps);
	
	}
}
	}	

