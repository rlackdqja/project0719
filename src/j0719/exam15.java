package j0719;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요 : ");
		int num1 = s1.nextInt();
		
		for(int i=1; i<=9; i++) {
			int times = num1*i;
			System.out.println(num1+" X "+i+" = "+times);
		}

	}

}
