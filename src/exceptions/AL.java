package exceptions;

import java.util.ArrayList;

public class AL {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.0);
		al.add(true);
		al.add("Mayur");
		al.add(new AL());
		System.out.println(al);
	}
}
