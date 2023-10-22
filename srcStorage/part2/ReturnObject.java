package part2;
class Book
{
	int bid;
	String bname;
	double bprice;
	public Book(int bid,String bname,double bprice)
	{
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	public static  Book addBook(int bid,String bname,double bprice)
	{
		return  new Book(bid,bname,bprice);
	}
}
public class ReturnObject {
	public static void main(String[] args) {
		Book b = Book.addBook(101, "You can Win", 500);
		System.out.println(b.bname);
		System.out.println(b.bprice);
	}
}
