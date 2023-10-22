package exceptions;
class NegativeSalaryException extends RuntimeException
{
	
}
class Employee
{
	int eid;
	double sal;
	String name;
	public Employee(int eid, double sal, String name) {
		super();
		this.eid = eid;
		if(sal>0)
		this.sal = sal;
		else
			throw new NegativeSalaryException();
		this.name = name;
	}
	
}
public class Driver1 {
	public static void main(String[] args) {
		Employee e = new Employee(10, 80000, "Smith");
		System.out.println(e.sal);
		Employee e1 = new Employee(14,-8000,"Mayur");
		System.out.println(e1.sal);
	}
}
