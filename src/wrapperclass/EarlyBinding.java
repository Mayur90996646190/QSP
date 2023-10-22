package wrapperclass;
class Engine
{
	double price;
	int bid;
	String brand;
	Engine(){}
	public Engine(double price, int bid, String brand) {
		super();
		this.price = price;
		this.bid = bid;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Engine [price=" + price + ", bid=" + bid + ", brand=" + brand + "]";
	}
	
}
class Car
{
	int cid;
	String name;
	double carprice;
	Engine e = new Engine();
	Car(){};
	public Car(int cid, String name, double carprice) {
		super();
		this.cid = cid;
		this.name = name;
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", carprice=" + carprice + ", e=" + e + "]";
	}
	
}
public class EarlyBinding {
	public static void main(String[] args) {
		Car c = new Car();
		c.e.price = 5000;
		c.e.bid = 2028;
		c.e.brand = "texetom";
		c.cid = 007;
		c.name = "Lambo";
		c.carprice = 8000000;
		System.out.println(c);
	}
}
