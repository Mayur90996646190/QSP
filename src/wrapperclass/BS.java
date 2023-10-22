package wrapperclass;

public class BS {
	public static void main(String[] args) {
		int[] a = {20,50,70,60,10,40,30};
		for (int i = 0; i < a.length; i++) {
			int pos = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[pos])
				{
					pos = j;
				}
				if(pos!=i)
				{
					int temp = a[i];
					a[i] = a[pos];
					a[pos]=temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
