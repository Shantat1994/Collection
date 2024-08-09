package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSetConversion {

	public static void main(String[] args) {
		
		List<String> lst=new ArrayList<String>();
		
		lst.add("Java");
		lst.add("Cypress");
		lst.add("Selenium");
		lst.add("Selenium");
		lst.add("Spring");
		lst.add(null);
		
		System.out.println("List value = "+lst);
		
		System.out.println("**********************************************************************");
		
		Set<String> set=new HashSet<String>();
		
		set.addAll(lst);
		
		System.out.println("Set Value = "+set);
		
		System.out.println("**********************************************************************");
		
		Set<String> set1=new LinkedHashSet<String>(lst);
		
		System.out.println("Set2 Value = "+set1);
		 
		
	
		
		
		
		

	}

}
