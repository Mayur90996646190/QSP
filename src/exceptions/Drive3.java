package exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Laptop
{
	int lid;
	String lname;
	double price;
	public Laptop(int lid, String lname, double price) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", price=" + price + "]";
	}
	
}
public class Drive3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Laptop(101,"hp",50000));
		al.add(new Laptop(102,"Lenovo",70000));
		al.add(new Laptop(103,"Dell",80000));
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
