package part2;
abstract class Laptop
{
	int lid;
	String brand;
	abstract void display();
	
}
public class LaptopDriver extends Laptop {
	public LaptopDriver(int lid,String brand)
	{
		this.lid = lid;
		this.brand = brand;
	}
	public void display()
	{
		System.out.println(lid);
		System.out.println(brand);
	}
	public static void main(String[] args)
	{
		Laptop l = new LaptopDriver(101,"Hp");
		l.display();
	}
}
