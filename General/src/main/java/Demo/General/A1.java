package Demo.General;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		
		int e = 23;
		
		int [] a = { 2,3,4, 5};
		System.out.println(a.length);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(7);
		list.add(12);
		list.add(123);
		for(Integer i :list ) {
			System.out.println(i);
		
		}
		
		for(Integer k=0;k<list.size();k++) {
			System.out.println(list.get(k));
		}
		
		
		A3 q = new A3();
		
		
		
	}

}
