package week4;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		int avg;

		System.out.println("더할 양수들을 입력하여주세요");
		System.out.println("종료하기 위해서는 음수를 입력하여주세요");
		Scanner input = new Scanner(System.in);

		// sum = sum + input.nextInt();

		while (true) {

			int i = input.nextInt();
			if (i < 0) {
				break;
			} else
				sum = sum + i;
				count++;

		}

		avg = sum / count;

		System.out.println("입력한 수의 합은 " + sum + "입니다");
		System.out.println("입력한 수의 평균은 " + avg + "입니다");

	}

}
