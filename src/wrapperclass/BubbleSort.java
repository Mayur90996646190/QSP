package wrapperclass;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {50,40,30,55,60};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}				
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
		
	
}
