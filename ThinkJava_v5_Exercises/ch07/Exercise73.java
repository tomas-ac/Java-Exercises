public class Exercise73 {

    public static void main(String[] args) {
	System.out.println(power( 56.3, 2));
    }

    public static double power(double x, int n) {  		//x^n
	double result = 1;
	int i = 1;
	while (i <= n) {
		result = result * x;
		i++;
	}
	return result;
    }

}