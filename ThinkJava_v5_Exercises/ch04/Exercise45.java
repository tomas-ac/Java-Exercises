public class Exercise45 {

	public static void main(String[] args) {
		checkFermat(2, 3, 4, 1);
	}

	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2) {
			if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
				System.out.println("Holly smokes, Fermat was wrong!");
			} else {
				System.out.println("No, that doesn't work.");
			}
		} else {
			System.out.println("n is not more than 2");
		}
	}

	//public static void raiseToPow(int base, int exponent){
	//	Math.pow(base, exponent);
	//}

}