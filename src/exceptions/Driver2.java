package exceptions;

import java.util.ArrayList;

class Pen
{
	int eid;
	double sal;
	String name;
	public Pen(int eid, double sal,String name) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.name = name;
	}
	public String toString()
	{
		return eid +" ="+ sal + " =" +name ;
	}
	
}
public class Driver2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Pen(101,5000,"Linc"));
		al.add(new Pen(102,6000,"Reynold"));
		al.add(new Pen(103,7000,"Balaji"));
		for(int i=0;i<al.size();i++)
		{
			Pen p = (Pen)al.get(i);
			System.out.println(p.eid);
		}
		for (int i = 0; i < al.size(); i++) {
			Pen p = (Pen)al.get(i);
			if(p.name.equalsIgnoreCase("LINC"))
			{
				al.remove(i);
			}
		}
		System.out.println(al);
	}
}
