package week6;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		System.out.print("몇 개의 수를 입력 받을까요? ");
		Scanner input = new Scanner(System.in);
		int numOfinput = input.nextInt();

		for (int i = 0; i < numOfinput; i++) {

			System.out.print("판별할 수는 ? ");
			int num = input.nextInt();

			System.out.println(num + "은 소수이다 : " + isPrime(num));
			System.out.println(OddEven(num));

		}
		
		//System.out.println("주어진 소수들의 합은 " +  + "입니다");

	}


	private static boolean isPrime(int n) {

		for (int i = 2; i < 10; i++) {
			if (n % i == 0) {
				return false;
			} else
				return true;
		}
		return true;

	}

	private static int OddEven(int n) {

		if (n % 2 == 0) {
			System.out.print(n + "은 짝수이다.");
		} else
			System.out.print(n + "은 홀수이다.");

		return n;

	}
}
