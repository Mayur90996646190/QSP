package part2;
class Battery
{
	int bid;
	String bbrand;
	double bprice;
	
	public void getCharging() {
		System.out.println("gettting  charge is started");
	}

	@Override
	public String toString() {
		return "Battery [bid=" + bid + ", bbrand=" + bbrand + ", bprice=" + bprice + "]";
	}
	
	
}
class Mobile
{
	int mid;
	String mbrand;
	double mprice;
	Battery b = new Battery();
	public void doCall() {
		System.out.println("Calling is Started");
	}
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mbrand=" + mbrand + ", mprice=" + mprice + ", b=" + b + "]";
	}
	
	
}
public class EarlyBinding {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.b.bbrand="Vguard";
		m.b.bprice = 2000;
		m.b.bid = 1020;
		m.mbrand = "RealMe";
		m.mid=380;
		m.mprice=20000;
		System.out.println(m);
		m.doCall();
		m.b.getCharging();
	}
}
