package collectio;

import java.util.HashMap;
import java.util.Map;

public class Map_learn {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> util = new HashMap<>();
 util.put("one", 1);
 util.put("two", 2);
 util.put("three", 3);
 util.put("four", 4);
 util.put("five", 5);
 util.put(null, 6);
 util.put("one", null);
 util.put(null, null);
 System.out.println(util);
 
 System.out.println(util.isEmpty());
 
 System.out.println(util.size());
 
 if (util.containsKey("five")){
 
 System.out.println("exist");}
 else 
  {
	 System.out.println("not exist");
 }
 }
	}


