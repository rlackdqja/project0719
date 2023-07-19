package j0719;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = s1.nextInt();
		
		if(num1%7==0) {
			System.out.println(num1+"은 7의 배수입니다.");
		}
		else {
			System.out.println(num1+"은 7의 배수가 아닙니다.");
		}

	}

}
