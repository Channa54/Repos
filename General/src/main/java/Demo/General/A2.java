package Demo.General;

import java.util.Collection;
import java.util.HashSet;

public class A2 {

	public static void main(String[] args) {
		
		
		Collection<String> c = new HashSet<>();
		
		c.add("channu");
		c.add("nagwar");
		
		for(String i :c) {
			System.out.println(i);
		}
		
	}

}
