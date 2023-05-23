package week6;

import java.util.Scanner;

public class CafeMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("어서오세요. 고객님의 성함을 입력해주세요.");
			System.out.print("성함 : ");
			String name = input.next();
			System.out.println(name + " 고객님, 메뉴를 골라주세요.");

			System.out.println(CafeMenu());

			System.out.print("번호를 입력해주세요 ");
			int num1 = input.nextInt();

			if (num1 == 1) {
				System.out.println(CoffeeMenu());
				System.out.print("번호를 입력해주세요 : ");
				int num2 = input.nextInt();
				System.out.println("감사합니다. 주문 번호는 " + num2 + " 번 입니다.");
				System.out.println("");

			} else if (num1 == 2) {
				System.out.println(TeaMenu());
				System.out.print("번호를 입력해주세요 : ");
				int num2 = input.nextInt();
				System.out.println("감사합니다. 주문 번호는 " + num2 + " 번 입니다.");
				System.out.println("");

			} else if (num1 == 3) {
				System.out.println(DessertMenu());
				System.out.print("번호를 입력해주세요 : ");
				int num2 = input.nextInt();
				System.out.println("감사합니다. 주문 번호는 " + num2 + " 번 입니다.");
				System.out.println("");
			} else
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			System.out.println("");


		}
	}

	private static boolean CoffeeMenu() {

		System.out.println("커피 메뉴판");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 바닐라라떼");
		System.out.println("3. 돌체라떼");
		return true;
	}

	private static boolean TeaMenu() {
		
		System.out.println("차 메뉴판");
		System.out.println("1. 녹차");
		System.out.println("2. 유자차");
		System.out.println("3. 허브티");
		System.out.println("4. 페퍼민트");
		return true;
	}

	private static boolean DessertMenu() {

		System.out.println("디저트 메뉴판");
		System.out.println("1. 딸기 케이크");
		System.out.println("2. 녹차 케이크");
		System.out.println("3. 초코 케이크");
		System.out.println("4. 쿠키");
		return true;
	}

	private static boolean CafeMenu() {

		System.out.println("1. COFFEE");
		System.out.println("2. TEA");
		System.out.println("3. DESSERT");
		return true;

	}

}
