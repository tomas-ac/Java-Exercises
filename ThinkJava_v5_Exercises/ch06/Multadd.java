public class Multadd {

	public static void main(String [] args) {
		System.out.println(multadd( 1.0, 2.0, 3.0));		//exercise 6.2.3
									//exercise 6.2.4
		double a1 = Math.cos(Math.PI/4.0);			//cos(PI/4)/2 = cos(PI/4) * 1/2
		double b1 = 1.0/2.0;					//1/2
		double c1 = Math.sin(Math.PI/4.0);			//sin(PI/4)

		System.out.println(multadd( a1, b1, c1));

		double a2 = 1.0;					//x*1 = x
		double b2 = Math.log(10);
		double c2 = Math.log(20);

		System.out.println(multadd( a2, b2, c2));

		System.out.println(yikes(5));				//exercise 6.2.5
		
	}

	public static double multadd(double a, double b, double c) {
		return (a*b + c);
	}

	public static double yikes(double x) {
		double a = x;
		double b = Math.exp(-x);				//e^-x
		double c = Math.sqrt(1.0 - b);				//square root(1-b)
		return multadd( a, b, c);
	}
}