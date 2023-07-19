package j0719;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int sum = 10000;
		System.out.printf("교통카드 잔액 : %d\n",sum);
		int amt=0;
		
		while(true) {
			System.out.print("교통카드 사용액 : ");
			amt = s1.nextInt();
			sum=sum-amt;
			System.out.printf("교통카드 잔액 : %d\n",sum);
			
			 if(sum<1300) {
				 System.out.println("교통카드 잔액이 부족하여 사용할 수 없습니다."); 
				 break;
			 }
			 
		}
		
	}

}
