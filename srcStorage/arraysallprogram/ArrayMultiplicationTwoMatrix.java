package arraysallprogram;

public class ArrayMultiplicationTwoMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] b ={{1,1,1},{2,2,2},{3,3,3}};
		
		int[][] mul = new int[a.length][b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(mul[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
