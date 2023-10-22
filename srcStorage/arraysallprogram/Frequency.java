package arraysallprogram;

//Frequency of each element
public class Frequency {
	public static void main(String[] args) {
		int[] a = { 10, 50, 60, 50, 80, 10 };
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}

	}
}
