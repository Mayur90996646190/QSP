//package exceptions;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//class Book1
//{
//	int bid;
//	String title;
//	String author;
//	public Book1(int bid, String title, String author) {
//		super();
//		this.bid = bid;
//		this.title = title;
//		this.author = author;
//	}
//	@Override
//	public String toString() {
//		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + "]";
//	}
//}
//public class Driver3 {
//	public static void main(String[] args) {
//		ArrayList<Book> library = new ArrayList<>();
//		library.add(new Book1(101,"Manual Testing","Suhas"));
//		library.add(new Book1(102,"Java","rajesh sir"));
//		library.add(new Book1(103,"Selenium","Sandeep Sir"));
//		//System.out.println(library);
//		for (int i = 0; i < library.size(); i++) {
//			System.out.println(library.get(i));
//		}
//		System.out.println();
//		int i = 0;
//		while(i<library.size())
//		{
//			System.out.println(library.get(i));
//			i++;
//		}
//		System.out.println();
//		Iterator il= library.iterator();
//		while(il.hasNext())
//		{
//			System.out.println(il.next());
//		}
//	}
//}
