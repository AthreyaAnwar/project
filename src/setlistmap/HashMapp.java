package setlistmap;

import java.util.*;
import java.util.Map.*;


public class HashMapp {
public static void main(String[] args) {
	HashMap<String, Integer> a = new HashMap<>();
	a.put("@", 2333);
	a.put("#",4567);
	a.put("%", 234);
	
		System.out.println(a);
		
		  for(Entry<String, Integer> entry: a.entrySet()) {
		    System.out.println(entry);
		    }
	
	
}
}
