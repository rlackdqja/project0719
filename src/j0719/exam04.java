package j0719;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력 하세요 : ");
		int num1 = s1.nextInt();
		System.out.print("두 번째 수를 입력 하세요 : ");
		int num2 = s1.nextInt();
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println(num1+" + "+num2+" = "+addition);
		System.out.println(num1+" - "+num2+" = "+subtraction);
		System.out.println(num1+" * "+num2+" = "+multiplication);
		System.out.println(num1+" / "+num2+" = "+division);
		System.out.println(num1+" % "+num2+" = "+remainder);
		
	}

}
