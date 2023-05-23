package week5;

import java.util.Scanner;

/**
 * 하나의 정수 n을 입력 받아서 1부터 100 사이의 모든 n의 배수와 배수의 합을 출력한다
 * printMultiples에서 입력받은 점수가 나누어 떨어지는 값을 찾아서 배수를 구하고
 * 22번째 줄로 호출되어 실행된다
 * sumOfMultiples에서 입력받은 정수가 나누어 떨어지는 값의 총합을 계산하여
 * 27번째 줄로 호출되어 실행된다
 * @author gyumin
 *
 */

public class Multiples2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 입렧하세요: ");
		int n = input.nextInt();

		printMultiples(n);
		System.out.println("");

		int sum = sumOfMultiples(n);
		System.out.println("1 이상 100 이하의 모든 " + n + "의 배수의 합은 " + sum + "입니다.");

		input.close();

	}

	/**
	 * 주어진 정수의 배수를 출력한다 배수의 범위: 1 ~ 100
	 * 
	 * @param num 주어진 수
	 */

	public static void printMultiples(int n) {
		int i = 0;
		int sum = 0;
		while (i++ < 100) {
			if (i % n == 0) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * 주어진 정수의 배수의 합을 반환한다 배수의 범위: 1 ~ 100
	 * 
	 * @param num 주어진 수
	 * @return 배수의 합
	 */

	public static int sumOfMultiples(int n) {
		int i = 0;
		int sum = 0;
		while (i++ < 100) {
			if (i % n == 0) {
				sum = sum + i;
			}
		}
		return sum;

	}
}
