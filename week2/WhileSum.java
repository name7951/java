package week2;

public class WhileSum {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while (i <=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 100까지 더한 값은 ? " + sum);
		
	}

}
