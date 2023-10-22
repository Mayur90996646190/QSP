package wrapperclass;

import java.util.Arrays;
import java.util.Comparator;

class Human
{
	double height;
	double weight;
	String name;
	public Human(double height, double weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Human [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}
	
	
}

class SortByHeight implements Comparator{
	public int compare(Object o1, Object o2) {
		Human h1 = (Human)o1;
		Human h2 = (Human)o2;
		if(h1.height>h2.height)
		return 1;
		else if(h1.height<h2.height)
		return -1;
		else
		return 0;
	}
}

class SortByWeight implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Human h1 = (Human)o1;
		Human h2 = (Human)o2;
		if(h1.weight>h2.weight)
			return 1;
		else if(h1.weight<h2.weight)
		return -1;
		else
		return 0;
	}
}
class SortByName implements Comparator
{
	public int compare(Object o1, Object o2) {
	Human h1 = (Human) o1;
	Human h2 = (Human) o2;
	return h1.name.compareTo(h2.name);
	}
}

public class Driver1
{
	public static void main(String[] args) {
		Human[] h = new Human[4];
		 h[0] = new Human(6.6, 56.0,"Smith");
		 h[1] = new Human(6.8,75,"Mayur");
		 h[2] = new Human(6.2,58,"Miller");
		 h[3] = new Human(5.9, 65,"Devid");
		 Arrays.sort(h,new SortByName());
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
	}
	
	
}
