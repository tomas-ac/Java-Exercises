public class Exercise76 {

	public static void main(String[] args) {
		for (double i = 0.1; i <= 100; i = i *10) {
			check(i);
		}
		for (double i = -0.1; i >= -100; i = i *10) {
			System.out.println(i + "\t" + gauss(i, 17.0) + "\t" + Math.exp(i));
		}
	}

	public static double gauss(double x, double n) {
		double expansion = 1.0;
		double numerator = x;
		double denominator = 1.0;
		int neg = -1;
		for (double i = 1; i <= n; i++) {
			neg = neg * (-1);
			numerator = numerator * x * x;
			denominator = denominator * i;
			expansion = expansion + neg * numerator / denominator;
		}
		return expansion;
	}

	public static double myexp2(double x, double n) {  		//Exercise 7.5.2 - e^x more efficient
		double result = 1.0;
		double numerator = x;
		double denominator = 1.0;				
		for (double i = 1; i <= n; i++) {			//no Math.pow or factorial
			numerator = numerator * x;
			denominator = denominator * i;
			result = result + numerator / denominator;
		}
		return result;
    	}

	public static void check(double x) {				//Exercise 7.5.3
		System.out.println( x + "\t" + myexp2(x, 17.0) + "\t" + Math.exp(x) + "\n");
	}
}