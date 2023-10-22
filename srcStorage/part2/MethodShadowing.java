package part2;
class A1
{
	public static void test()
	{
		System.out.println("From class A1");
	}
}
class B1 extends A1
{
	public static void test()
	{
		System.out.println("From class B1");
	}
}
public class MethodShadowing {
	public static void main(String[] args) {
		A1 obj = new B1();
		B1 obj1 = (B1)obj;
		obj.test();
		
	}
}
