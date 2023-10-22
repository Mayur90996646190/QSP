package arraysallprogram;

public class ArrayaddTwoMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b ={{4,5,6},{4,5,6},{4,5,6}};
		
		int[][] sum = new int[a.length][b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				sum[i][j] = a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
