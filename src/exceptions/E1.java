package exceptions;

public class E1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			String msg = e.getMessage();
			//System.out.println(msg);
			e.printStackTrace();
		}
	}
}
