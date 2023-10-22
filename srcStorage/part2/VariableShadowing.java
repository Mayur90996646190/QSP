package part2;
class A
{
	int a = 10;
}
class B extends A
{
	int a = 20;
}
public class VariableShadowing {
	public static void main(String[] args) {
		A obj = new B();
		B obj1 =(B)obj;
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}
}
