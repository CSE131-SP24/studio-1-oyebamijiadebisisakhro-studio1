package studio1;

import java.util.Scanner;

public class field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first two integers to be averaged?");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println((double)(n1 + n2)/2);
	}

}
