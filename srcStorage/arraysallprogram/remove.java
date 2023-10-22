package arraysallprogram;

public class remove {
	public static void main(String[] args) {
		int[] a = {20,50,60,55,61,24,58};
		int[] res = remove.remove(a, 5);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
	}
	public static int[] remove(int[] a,int index)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("index is not in range");
			return a;
		}
		int[] res = new int[a.length-1];
		//res[index]=element;
		for (int i = 0; i < a.length; i++) {
			if(i<index)
			{
				res[i]=a[i];
			}
			else
				res[i-1]=a[i];
		}
		return res;
	}
}
