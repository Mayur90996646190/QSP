package arraysallprogram;

public class LargestLengthofString {
	public static void main(String[] args) {
		String[] s = {"abc","abcd","abcdsen","abcde","ab"};
		String max = s[0];
		for(int i=0; i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
			}
		}
		System.out.println(max);
	}
}
