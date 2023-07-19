package j0719;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = s1.nextInt();
		
		for(int i=1; i<=num1; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
		}
			System.out.println();
	}
}
}
