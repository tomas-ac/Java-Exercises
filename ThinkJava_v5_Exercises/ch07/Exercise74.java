public class Exercise74 {

	public static void main(String[] args) {
		for( double i = 0.1; i <= 100; i = i *10) {
			check(i);
		}
	}

	public static double factorial(double n) {  			//iterative version of factorial
		double result = n;
		double i = n-1;
		while (i > 0) {
			result = result * i;
			i--;
		}
		return result;
   	}

	
	public static double myexp(double x, double n) {		//Exercise 7.5.1 - e^x
		double e = 1.0;
		for (double i = 1; i <= n; i++) {
			e = e + Math.pow(x, i) / factorial(i);		//e^x = i + x + x^(i+1) / (i+1)!
		}
		return e;
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
		System.out.println( x + "\t" + myexp(x, 17.0) + "\t" + myexp2(x, 17.0) + "\t" + Math.exp(x) + "\n");
	}
}