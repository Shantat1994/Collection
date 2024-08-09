package collectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("Jv", "Java");
		hm.put("CY", "Cypress");
		hm.put("Pw", "Playwrite");
		hm.put("Se", "Selenium");
		hm.put("Ru", "Ruby");
		hm.put("Jv", "Java");

		System.out.println(hm);

		System.out.println(hm.get("Jv"));

		System.out.println(hm.containsKey("Pw"));

		System.out.println(hm.containsKey("PW"));

		System.out.println(hm.keySet());

		System.out.println(hm.values());

		System.out.println(hm.get("JV"));
		
		System.out.println("*****************************************************************************");
		
		

		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();

		hm1.put("Jv", "Java");
		hm1.put("CY", "Cypress");
		hm1.put("Pw", "Playwrite");
		hm1.put("Se", "Selenium");
		hm1.put("Ru", "Ruby");
		hm1.put("Jv", "Java");
		
		System.out.println(hm1);
		
		System.out.println("*****************************************************************************");
		
		TreeMap<String, String> hm2 = new TreeMap<String, String>();

		hm2.put("Jv", "Java");
		hm2.put("CY", "Cypress");
		hm2.put("Pw", "Playwrite");
		hm2.put("Se", "Selenium");
		hm2.put("Ru", "Ruby");
		hm2.put("Jv", "Java");
		
		System.out.println(hm2);
		
		
		

	}

}
