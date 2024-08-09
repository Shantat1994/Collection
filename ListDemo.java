package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//List initialise;
		
		List<String> l1 =new ArrayList<String>();
		
		List<String> l2=Arrays.asList("Cypress","Java","Playwrite");
		
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Mango");
		l1.add("Lichi");
		
		List<List<String>> master= new ArrayList<List<String>>();
		
		master.add(l1);
		master.add(l2);
		
		System.out.println(master.get(0));
		
		//List Iterate
		
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("**************************");
		
		for(String a:l2)
		{
			System.out.println(a);
		}
	
		System.out.println("**************************");
		
		Iterator<List<String>> it=master.iterator();
		
		while(it.hasNext())
		{
			List<String> value=it.next();
			System.out.println(value);
			
		}
		
		
		

	}

}
