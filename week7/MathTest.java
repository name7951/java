package week7;

import java.util.Scanner;
import java.lang.Math; // Math 클래스 활용

public class MathTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble(); // 두 개의 실수 입력받기 (1)

		System.out.println(num1 + " 의 절댓값 : " + Math.abs(num1)); // 절댓값 출력 (2)
		System.out.println(num1 + " 의 3제곱 : " + Math.pow(num1, 3)); // 3제곱 출력 (3)
		System.out.println(num2 + " 의 제곱근 : " + Math.sqrt(num2)); // 제곱근 출력 (4)
		System.out.println(num2 + "보다 크거나 같은 수 중에서 가장 작은 정수 : " + Math.ceil(num2)); // 크거나 작은 수 중에서 가장 작은 정수 (5)
		System.out.println("두 실수 중에서 큰 실수 : " + Math.max(num1, num2));
		

	}
	
	

}
