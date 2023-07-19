package j0719;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int fare = 0;
		int sum  = 0;
		
		for(int i=1; ; i++) {
		System.out.print("요금을 입력 하세요: ");
		fare = s1.nextInt();
		sum=sum+fare;
		if(sum>100000) {
			System.out.println("총수입은"+sum+"이다");
			break;
		}
		}

	}

}
