package part2;

public class ArrayPrime {
	public static void main(String[] args) {
		int[] a = {7,80,5,36,23,19};
		for (int i = 0; i < a.length; i++) {
			boolean res = isPrime(a[i]);
			if(res)
				System.out.println(a[i]);
		}
	}
	public static boolean isPrime(int a)
	{	int i=2;
		
		while(i<a/2)
		{
			if(a%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
