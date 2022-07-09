package frameworkclass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	
	private void m1(int id ) {
		
	}
	private void m2(int a, int b) {
		
	}
	private void m3(ArrayList<Integer> i) {
		
	}
	private void m4(Set<Integer> j) {
		
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1(10);
		a.m2(10, 20);
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(20);
	    i.add(30);
	    a.m3(i);
	    
	    Set<Integer> j = new LinkedHashSet<Integer>();
	    j.add(10);
	    j.add(100);
	    j.add(80);
	    a.m4(j);
	 System.out.println(i);   
	 System.out.println(j);
	}
}
