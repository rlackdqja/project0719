package j0719;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int sum = 10000;
		int fare = 0;
		
		for(int i=1; ; i++) {
			
		
			System.out.println("교통카드 잔액 : "+sum);
			System.out.print("사용할 금액을 입력하세요 : ");
			fare = s1.nextInt();
			sum = sum - fare;
			if(sum<1300) {
				System.out.println("교통카드 잔액 : "+sum);
				System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다.");
				break;
		}
	}
	}

}
