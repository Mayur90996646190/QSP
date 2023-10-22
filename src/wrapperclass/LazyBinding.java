package wrapperclass;
class battery
{
	String name;
	int bid ;
	battery(){}
	public battery(String name, int bid) {
		super();
		this.name = name;
		this.bid = bid;
	}
	
}
class Mobile
{
	int mid;
	String mname;
	battery b ;
	Mobile(){}
	public Mobile(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public void calling()
	{
		b = new battery();
		System.out.println("Calling is started");
	}
	public void displayDetails()
	{
		
		System.out.println(mid);
		System.out.println(mname);
		
	}
	
}
public class LazyBinding {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.calling();
		m.displayDetails();
		m.b.name = "Micgdsi";
		System.out.println(m.b.name );
	}
}
