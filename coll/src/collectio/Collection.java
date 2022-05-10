package collectio;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Collection {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> prolang= new HashSet<>();
		
		prolang.add("c");
		prolang.add("c++");
		prolang.add("java");
		prolang.add("java");
		prolang.add(null);
		System.out.println(prolang);
		
		boolean i = prolang.isEmpty();
		System.out.println(i);
		
		Set<String> dogs = new HashSet<>();
		   dogs.addAll(prolang);
		   System.out.println(dogs);
		   
		boolean h =   dogs.contains("mava");
		 System.out.println(h);
		 
		 dogs.isEmpty();
		 System.out.println(dogs);
		 
		boolean j = dogs.containsAll(prolang);
		 System.out.println(j);
		 
		boolean t= dogs.equals(prolang);
		 System.out.println(t);
		
}
}