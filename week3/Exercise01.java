package week3;

public class Exercise01 {

	public static void main(String[] args) {

		//문제 1
		final double PI = 3.141952;
		double radius = 13.6;
		
		//PI = 3.14;
		//PI가 final로 고정이 되었으므로 따로 PI를 지정해줘도 의미가 없다
		
		double area = PI*radius*radius;
		
		//문제 2
		int i = 0;
		while (i++ < 10) // ;이 없어도 된다 
			System.out.println("i의 값: " + i);
		
		//문제 3
		boolean x = true;
		boolean y = false;
		if(!y) {
			String x1 = "Hello!";  //같은 변수 명을 사용할 수 없어서 다른 변수명 사용
			System.out.println(x1);
		}
		
		//문제 4
		double a = 10;
		double b = 10.5;
		int c = 'A' + 1;
		String d = 'A' + 1 + ""; //" "가 사용되므로 String을 사용해야한다
		
		//문제 5
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		if (num1 < num2 && num2 <num3) { //연속해서 쓰는 게 아니라 and 연산자를 이용해서 사용한다
			System.out.println(num1 + " < " + num2 + " < " + num3);
		}
		
	}

}
