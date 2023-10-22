package arraysallprogram;
//add an element at perticular index
public class add {
	public static void main(String[] args) {
		int[] a = {50,10,20,60,50,40,30};
		int[] res = add.add(a,55,3);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	public static int[] add(int[] a,int element,int index)
	{	if(index>a.length-1 || index<0)
		{
			System.out.println("Please enter the value with in range");
			return a;
		}
		int[] res = new int[a.length+1];
		res[index] =element;
		for (int i = 0; i < a.length; i++) {
			if(i<index)
			{
				res[i]=a[i];
			}
			else
				res[i+1]=a[i];
		}
		return res;
	}
}
