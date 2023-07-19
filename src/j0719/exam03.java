package j0719;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		final float PI = 3.14f;
		
		System.out.print("원기둥의 밑면의 반지름은? ");
		float radius = s1.nextFloat();
		System.out.print("원기둥의 높이는? ");
		float height = s1.nextFloat();
		
		float volume = radius*radius*height*PI;
		System.out.printf("원기둥의 부피는 %.1f", volume);
		}

}
