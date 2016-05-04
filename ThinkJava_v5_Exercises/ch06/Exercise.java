public class Exercise {

    public static void main(String[] args) {
	boolean flag1 = isHoopy(202);
	boolean flag2 = isFrabjuous(202);
///contiue to copy! p.70, ex 6.4
    }

    public static double ack(int m, int n) {
	if (m == 0) {
		return n+1;
	}
	else if (m > 0 && n == 0) {
		int a = m - 1;
		return ack( a, 1);
	}
	else if (m > 0 && n > 0) {
		int a = m - 1;
		int b = ack(m, n-1);
		return ack( a, b);
	}
        
    }

}
