package part2;
abstract class I1{
	abstract void test();
}
public class Inter extends  I1{
	public void test()
	{
		System.out.println("From class Inter");
	}
	public static void main(String[] args) {
		I1 obj = new Inter();
		obj.test();
	}
}
