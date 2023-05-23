package week7;

/**
 * Test와 Car 두 개의 클래스로 이루어진 어플리케이션입니다. run(int speed), keyTurnOn(), stop() 메소드를
 * 가진 클래스 Car를 만들고 Test 클래스의 메인함수에서 Car 객체를 생성한 후, 메소드를 호출하는 예제
 * 
 * @author 418-20
 * @param i
 *
 */

public class Test {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.run(50);
		c1.keyTurnOn();
		c1.run(30);
		c1.stop();

	}

}

class Car {

	public void run(int i) {

		System.out.println("달립니다. 현재속도 : " + i + " km/h");

	}

	public void stop() {

		System.out.println("멈춥니다.");

	}

	public void keyTurnOn() {

		System.out.println("키를 돌립니다.");

	}

}
