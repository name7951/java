package week7;

public class Ex7_3 {

	public static void main(String[] args) {
		OptExp opt = new OptExp();
		String exp = "[{2+ (3*3) -4)}]";
		System.out.println(exp);
		if (opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!!");
	}
}
