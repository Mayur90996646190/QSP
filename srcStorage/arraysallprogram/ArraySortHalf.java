package arraysallprogram;

import java.util.Arrays;

public class ArraySortHalf {
	public static void main(String[] args) {
		int[] a= {10,50,44,32,25,60,84,50};
		int n = a.length;
		Arrays.sort(a,0,n/2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
