public class BeerSong {

	public static void song(int n) {
		if (n > 0) {
			System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer, ya' take one");
			System.out.println("down, ya' pass it around, " + (n-1) + " bottles of beer on the wall.");
			newLine();
			song(n-1);
		} else if (n == 0) {
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take");
			System.out.println("one down, ya' can't pass it around, 'cause there are no more");
			System.out.println("bottles of beer on the wall!");
		}	
	}

    	public static void newLine() {
        	System.out.println();
   	}

	public static void main(String[] args) {
		song(99);
	}

}