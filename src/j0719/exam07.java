package j0719;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력 하세요(실수) : ");
		float num1 = s1.nextFloat();
		System.out.print("두 번째 수를 입력 하세요(실수) : ");
		float num2 = s1.nextFloat();
		
		float addition = num1 + num2;
		float subtraction = num1 - num2;
		float multiplication = num1 * num2;
		float division = num1 / num2;
		float remainder = num1 % num2;
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, addition);
		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, subtraction);
		System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, multiplication);
		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, division);
		System.out.printf("%.2f %% %.2f = %.2f\n", num1, num2, remainder);
		
	}

}
