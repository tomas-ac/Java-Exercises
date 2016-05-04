public class Recurse {
	public static void main(String[] args) {
		System.out.println(first("banana"));
		System.out.println(rest("lemon"));
		System.out.println(length("eye"));
		printString("monkey");
		printBackward("mouse");
		System.out.println(reverseString("Murder"));
	}

	//first: returns thefirst character of the given string
	public static char first(String s) {
		return s.charAt(0);
	}

	//rest: returns a new String that contais all but the first letter of the given String
	public static String rest(String s) {
		return s.substring(1, s.length());
	}

	//length: returns the length of the given String
	public static int length(String s) {
		return s.length();
	}

	//printString: prints the letters of the String, one on each line
	public static void printString(String s) {
		int n = 0;
		if (n < s.length()){
			System.out.println(s.charAt(n));
			printString(s.substring(n+1, s.length()));
		}
	}

	//printBackward: same as printString but backwards
	public static void printBackward(String s) {
		int n = s.length()-1;
		if (n < s.length() && n >= 0){
			System.out.println(s.charAt(n));
			printBackward(s.substring(0, n));
		}
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
