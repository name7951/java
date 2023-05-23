package week3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		int n = input.nextInt();
		
		System.out.println("1 이상 100 이하의 모든 " + n + "의 배수를 출력합니다.");
		
		int i = 0;
		int sum = 0;
		while (i++ < 100) {
			if (i%n == 0) {
				sum = sum + i;
				System.out.print(i + " ");
			}
		}
	
		System.out.println("");
		System.out.println("1이상 100이하의 모든 " + n + "의 배수의 합은 " + sum + "입니다.");
		
	}

}
