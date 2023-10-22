package arraysallprogram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Heart";
		String s2 = "Earth";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			//String convert to chararray
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			//chararray convert to String
			String a1=new String(ch1);
			String a2=new String(ch2);
			
			if(a1.equals(a2))
			{
				System.out.println(s1+" and "+s2+" are anagram");
			}
			else
				System.out.println(s1+" and "+s2+" are not anagram");
			
			
		}
	}
}
