package collectionPractice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ListofMaps {

	public static void main(String[] args) {
		
		List<LinkedHashMap<String, Object>> lst =new ArrayList<LinkedHashMap<String,Object>>();

		LinkedHashMap<String, Object> student1 = new LinkedHashMap<String, Object>();

		student1.put("Name", "Test");
		student1.put("Email", "test@gmail.com");
		student1.put("Phone", "4865738765");
		
		System.out.println(student1);
		
		lst.add(student1);

		System.out.println("************************************************************************");

		LinkedHashMap<String, Object> student2 = new LinkedHashMap<String, Object>();

		student2.put("Name", "Employee");
		student2.put("Email", "employee@gmail.com");
		student2.put("Phone", "7386472839");
		
		System.out.println(student2);
		System.out.println("************************************************************************");
		lst.add(student2);
		
		System.out.println(lst);
		
		System.out.println("************************************************************************");
		
		System.out.println(lst.get(0).get("Name"));
		
		

	}

}
