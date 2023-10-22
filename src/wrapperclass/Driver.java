package wrapperclass;

import java.util.Arrays;

class Employee implements Comparable{
	int eid;
	String name;
	private double price;
	Employee(){}
	
	public Employee(int eid, String name,double price) {
		super();
		this.eid = eid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Object o)
	{
		Employee e = (Employee)o;
		if(this.price > e.price)
		{
			return 1;
		}
		else if (this.price<e.price)
		{
			return -1;
		}
		else
			return 0;
	}
	
}
public class Driver {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0]=new Employee(101,"Smith",50000.00);
		emp[1] = new Employee(103,"Witdh",60000.00);
		emp[2]= new Employee(104,"mayur",45000.00);
		emp[3]=new Employee(102,"sans",40000.00);
		Arrays.sort(emp);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}
	

}
