package arraysallprogram;

import java.util.Scanner;

public class Merge2array {
	public static void main(String[] args) {
		int[] a = toRead();
		int[] b = toRead();
		int[] res = Merge2array.merge(a, b);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	public static int[] toRead() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Element of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static int[] merge(int[] a,int[] b)
	{	int[] res = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i] = b[i];
		}
		return res;
	}
}
