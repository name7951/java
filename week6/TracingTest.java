package week6;

/**
 * 정수의 제곱을 계산하는 프로그램
 * @author 박규민
 *
 */
public class TracingTest {

	public static void main(String[] args) {
		System.out.println("1부터 4까지의 정수 제곱을 계산하는 프로그램입니다.");
		
		for (int i = 1; i < 5; i++) 
			System.out.println(i + " * " + i + " = " + square(i));
		
		System.out.println("종료되었습니다.");
		
	}
	
	/**
	 * 주어진 수를 제곱하는 함수
	 * @param n 주어진 수
	 * @return 제곱한 수
	 */
	public static int square(int n) {
		int n2 = n*n;
		return n2;
	}

}
