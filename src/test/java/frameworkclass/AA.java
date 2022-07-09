package frameworkclass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.*;

public class AA {
	private int m1() {
		return 100;
	}
	private float m2() {
		return 12.34f;
	}
	private LinkedHashMap<String, String> m3(){
		LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
		m.put("name", "Pandi");
		m.put("email", "pandi@gmail.com");
		m.put("cource", "Java Selenium");
		return m;
	}
		private List<Integer> m4() {
		List<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(21);
		i.add(83);
		return i;
	}
	public static void main(String[] args) {
		AA a = new AA();
		int m1 = a.m1();
		System.out.println(m1);
		float m2 = a.m2();
		System.out.println(m2);
		LinkedHashMap<String, String> m3 =  a.m3();
		System.out.println(m3);
		List<Integer> m4 = a.m4();
		System.out.println(m4);
		
		System.out.println("July class  update");
		System.out.println("July class  update");
		System.out.println("July class  update");
		System.out.println("July class  update");
		
		
	}
}
