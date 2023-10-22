package exceptions;

import java.util.ArrayList;
import java.util.ListIterator;

class Book
{
	int bid;
	String title;
	double price;
	Book(int bid,String title,double price)
	{
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}
	
}
public class Driver4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Book(101,"Manual Testing",600));
		al.add(new Book(102,"JAVA",800));
		al.add(new Book(103,"Seleninum",700));
		al.add(new Book(104,"SQL",500));
		ListIterator<Book> li = al.listIterator();
		while(li.hasNext())
		{
			Book b = li.next();
			if(b.price==700)
			{
				li.add(new Book(106,"automation",500));
			}
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println();
		while(li.hasPrevious())
		{
			Book b = li.previous();
			if(b.title.equalsIgnoreCase("JAVA"))
			{
				li.remove();
			}
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println();
		while(li.hasNext())
		{
			Book b = li.next();
			if(b.bid == 103)
			{
				b.bid = 108;
			}
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
