package Demo.General;

import java.util.HashMap;
import java.util.Map;

public class A10 {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "channu");
		map.put(2, "basava");
		
		System.out.println(map.size());
		 for ( Integer i : map.keySet()) {
			 System.out.println(map.get(i));
		 }
		
		
		

	}

}
