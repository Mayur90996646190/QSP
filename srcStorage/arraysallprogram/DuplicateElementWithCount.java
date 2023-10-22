package arraysallprogram;

public class DuplicateElementWithCount {
	public static void main(String[] args) {
		int[] a = { 10, 50, 60, 50, 60, 10 };
		boolean[] b = new boolean[a.length];
		for (int i = 0; i< a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1)
					System.out.println(a[i] + " " + count);
			}
		}

	}
}
