package part2;
class Student
{
	String name;
	int sid;
	public Student(String name)
	{
		this.name = name;
	}
	public void takeAdmission() {
		System.out.println(name + " Admission is taken");
	}
}
class School
{
	String sname;
	int noofstudent;
	int noofteachers;
	Student s ;
	public void provideAdmission() {
		s = new Student("Mayur");
		System.out.println("Admission is Provided");
	}
}
public class LazyBinding {
	public static void main(String[] args) {
		School sc = new School();
		sc.provideAdmission();
		sc.s.takeAdmission();
	}
	
}
