package j0719;

import java.util.Scanner;

public class exam09_2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 ==> ");
		String score = s1.next();
		
		switch(score) {
			case "A":
			case "B":
				System.out.println("참 잘하였습니다.");
				break;
				
			case "C":
			case "D":
				System.out.println("좀 더 노력하세요.");
				break;
			
			case "F":
				System.out.println("다음 학기에 다시 수강하세요.");
				break;
				
			default:
				System.out.println("잘못된 학점입니다.");
						}

	}

}
