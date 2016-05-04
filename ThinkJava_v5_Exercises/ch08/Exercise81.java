public class Exercise81 {

	public static void main(String[] args) {
	printReverseString("Murder");
	}

	//prints string backwards
	public static void printReverseString(String s) {
		System.out.print(reverseString(s));
	}

	//reverseString: returns String backwards.
	public static String reverseString(String s) {
		int n = s.length()-1;
		if (n < s.length() && n >= 0){
			System.out.print(s.charAt(n));
			reverseString(s.substring(0, n));
		}
		return "";
	}
}