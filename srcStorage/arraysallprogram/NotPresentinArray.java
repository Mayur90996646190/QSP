package arraysallprogram;

public class NotPresentinArray {
	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 10 };
		for (int i = 1; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(i);
		}
	}
}
