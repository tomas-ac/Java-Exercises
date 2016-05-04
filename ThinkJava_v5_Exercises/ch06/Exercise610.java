public class Exercise610 {

    public static void main(String[] args) {
	System.out.println(gcd( 36, 20));
    }

    public static int gcd(int a, int b) {		//gcd(a,b)=gcd(b,r) Euclid's Algorithm

	if (b > 0) {
		int r = a % b;
		return gcd(b, r);
	}
	return a;
       
    }

}