package exceptions;

import java.util.ArrayList;

public class PrimeNum {
	public static ArrayList isPrime()
	{
		ArrayList al = new ArrayList();
		int num = 100;
		for(int m=0;m<num;m++)
		{
			int i=2;
			int count = 0;
			while(i<=m/2)
			{
				
				if(m%i==0)
				{
					count++;
					break;
				}
				i++;	
			}
			if(count==0)
				al.add(m);
		}
		return al;
	}
	public static void main(String[] args) {
		ArrayList al =isPrime();
		System.out.println(al);
	}
}
