package arraysallprogram;

//check given no is prime or not
public class Isprimeornot {
	public static void main(String[] args) {
		int[] a = { 15, 17, 21, 23, 29 };
		for (int i = 0; i < a.length; i++) {
			boolean res = Isprimeornot.isPrime(a[i]);
			if (res)
				System.out.println(a[i]);
		}

	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
