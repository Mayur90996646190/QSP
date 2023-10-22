package part2;
class Employee
{
	int eid;
	String name;
	double sal;
	Employee(int eid,String name,double sal)
	{
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
}
class Company
{
	public void paySalary(Employee e)
	{
		if(e.sal>0 && e.name.equalsIgnoreCase("smith")||e.name.equalsIgnoreCase("neha"))
		{
			System.out.println(e.name + "'s salary has been paid");
		}
		else
			System.out.println("Employee salary has not paid");
	}
}
public class ObjectAsInput {
	public static void main(String[] args) {
		Company c = new Company();
		Employee e1 = new Employee(102,"Smith",50000);
		Employee e2 = new Employee(104,"Neha",60000);
		c.paySalary(e1);
		c.paySalary(e2);
		
	}
}
