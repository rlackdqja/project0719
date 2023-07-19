package j0719;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("정수를 입력 하세요 : ");
		int num1 = s1.nextInt();
		
		if(num1>100) {
			System.out.println("100보다 크군요..");
		}
		else if(num1<100) {
			System.out.println("100보다 작군요..");
		}
		else {
			System.out.println("100과 같군요..");
		}
	}

}
