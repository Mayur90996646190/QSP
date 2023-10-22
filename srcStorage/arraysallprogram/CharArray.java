package arraysallprogram;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char[] ch = new char[size];
		System.out.println("Enter the characters of an array");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
		}
		System.out.println("Characters of an Array");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
