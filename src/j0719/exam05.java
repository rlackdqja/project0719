package j0719;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 ==> ");
		int score = s1.nextInt();
		
		if (score>=80) {
			System.out.println("축하합니다. 합격입니다.");
		}
		else {
			System.out.println("아쉽네요, 불합격입니다.");
		}

	}

}
