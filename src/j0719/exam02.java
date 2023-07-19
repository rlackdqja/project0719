package j0719;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		float distance = 0; //거리
		double mileage = 0; //연비
		float oil = 0; //휘발유
		
		System.out.print("주행거리를 입력하세요 : ");
		distance = s1.nextFloat();
		System.out.print("사용한 휘발유 양을 입력하세요 : ");
		oil = s1.nextFloat();
		mileage = distance/oil; //연비계산
		System.out.print("연비 : "+mileage);
		
		}

}
