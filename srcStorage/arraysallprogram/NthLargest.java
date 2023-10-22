package arraysallprogram;

public class NthLargest {
	public static void main(String[] args) {
		int n=1;
		int[] a = {10,5,25,20,35,15,30};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]>a[i])
				{
					count++;
				}
			}
			if(count==n-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}
