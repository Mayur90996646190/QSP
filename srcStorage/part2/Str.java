package part2;

public class Str {
	public static void main(String[] args) {
		String[] s = {"abc","ab","abcd","jhgddsaz"};
		String max=s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>max.length())
			{
				max = s[i];
			}
		}
		System.out.println(max);
	}
}
