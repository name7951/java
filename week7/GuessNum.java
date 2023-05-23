package week7;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("숫자 맞추기 (1 ~ 10)");
		System.out.print("숫자를 입력하세요: ");
		int num = input.nextInt();

		Random r = new Random();

		if (num == r.nextInt(9)) {
			System.out.println("정답입니다!!");
			System.out.println("랜덤 숫자는 " + r + " 입니다");
		} else
			System.out.println("틀렸습니다");
			System.out.println("랜덤 숫자는 " + r + " 입니다");

	}

}
