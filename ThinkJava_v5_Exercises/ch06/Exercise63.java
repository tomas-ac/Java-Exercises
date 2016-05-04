public class Exercise63 {

	public static void main(String [] args) {
		System.out.print(isTriangle(22, 6, 6));
	}

	public static boolean isTriangle(int a, int b, int c) {
		if (a > (b+c)) {
			return false;
		} else if (b > (a+c)) {
			return false;
		} else if (c > (a+b)) {
			return false;
		} else {
			return true;
		}
	}
}