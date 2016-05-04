public class Exercise65 {

	public static void main(String [] args) {
		distance(22, 6, 6, 8);
	}

	public static void distance(double x1, double y1, double x2, double y2) {
		double a = (x2 - x1);
		double b = (y2 - y1);
		double distance = Math.sqrt(sumSquares( a, b));
		System.out.print(distance);
	}

	public static double sumSquares(double a, double b) {
		return((a*a) + (b*b));
	}
}