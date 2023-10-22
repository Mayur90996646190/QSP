package arraysallprogram;

public class ReverseTheIntegerArray {
	public static void main(String[] args) {
		int[] a = {80,50,60,50,40,10};
		int i=0; 
		int j=a.length-1;
		while(i<j)
		{
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;
		}
		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m]+" ");
		}
		
	}
}
