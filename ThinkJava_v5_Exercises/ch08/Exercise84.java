public class Exercise84 {

	public static void main(String[] args) {
		System.out.println(evenParenthesis("((3+7) *2)"));
		//countLetters2("banana", 'a');
	}

	public static int evenParenthesis(String s) {
		int i = 0;
		int count = 0;

		while (i < s.length()) {
			char c = s.charAt(i);

			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
			i++;
		}
		return count;
	}

/*	public static void countLetters2(String s, char a) {		//use indexOf terminar
		int length = s.length();
		int count = 0;
		int index = s.indexOf(a);
		while (index < length) {				
			if(s.charAt(index) == a){
				count++;
			}
			index++;
		}
		System.out.println(count);
	}*/
} 