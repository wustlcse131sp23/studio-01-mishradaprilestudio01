package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hey! What are the first two integers to be averaged?");
		System.out.println("First integer value?");
		int n1 = in.nextInt();
		System.out.println("Second integer value?");
		int n2 = in.nextInt();
		System.out.print((n1 + n2) / 2.0);
	}
}
