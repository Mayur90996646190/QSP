package arraysallprogram;

public class LargestElementintheArray {
	public static void main(String[] args) {
		int[] a = {10,80,50,60,120,133};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
