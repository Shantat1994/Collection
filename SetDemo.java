package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// HashSet - no insertion order

		Set<String> st = new HashSet<String>();

		st.add("Java");
		st.add("Java");
		st.add("Cypress");
		st.add("Playwrite");
		st.add("Playwrite");
		st.add("Selenium");
		st.add("Ruby");

		System.out.println(st);

		System.out.println("***********************************************************************");

		Iterator<String> it = st.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
		System.out.println("***********************************************************************");

		// TreeSet - based on Alphabetical order

		Set<String> st1 = new TreeSet<String>();

		st1.add("Apple");
		st1.add("Apple");
		st1.add("Banana");
		st1.add("Mango");
		st1.add("Grapes");
		st1.add("Grapes");
		st1.add("Orange");

		System.out.println(st1);
		
		System.out.println("***********************************************************************");
		
		// LinkedHashSet - based on Alphabetical order

				Set<String> st2 = new LinkedHashSet<String>();

				st2.add("Hen");
				st2.add("Hen");
				st2.add("Tiger");
				st2.add("Lion");
				st2.add("Zebra");
				st2.add("Zebra");
				st2.add("Mouse");

				System.out.println(st2);
		
		

	}

}
