package j0719;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 ==> ");
		String score = s1.nextLine();
		
		if(score.equals("A")) {
			System.out.println("참 잘하였습니다.");
		}
		else if(score.equals("B")) {
			System.out.println("참 잘하였습니다.");
		}
		else if(score.equals("C")) {
			System.out.println("좀 더 노력하세요");
		}
		else if(score.equals("D")) {
			System.out.println("좀 더 노력하세요");
		}
		else if(score.equals("F")) {
			System.out.println("다음 학기에 다시 수강하세요");
		}
		else {
			System.out.println("잘못된 학점입니다");
		}
	}

}
