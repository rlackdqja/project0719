package j0719;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("평점을 입력하세요: ");
		float score = s1.nextFloat();
		
		System.out.println("평점: "+score);
		
		if(score>=4.0) {
			System.out.println("장학금 대상자입니다");
		}
		else {
			System.out.println("장학금 대상자가 아닙니다");
		}
	}

}
