package week4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("간단한 계산기 입니다.");
		System.out.println("원하는 연산을 입력해주세요.");
		System.out.println("예시 : 6 + 3");

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		String op = input.next();
		int y = input.nextInt();
		int result;
		
		switch (op) {
		
		case "+":
			result = x + y;
			System.out.println(x + " + " + y + " = " + result);
			break;
		
		case "-":
			result = x - y;
			System.out.println(x + " - " + y + " = " + result);
			break;
			
		case "*":
			result = x * y;
			System.out.println(x + " * " + y + " = " + result);
			break;
			
		case "/":
			result = x / y;
			System.out.println(x + " / " + y + " = " + result);
			break;

		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}

	}

}
