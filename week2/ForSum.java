package week2;

public class ForSum {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 더한 값은 ? " + sum);
		
	}

}
