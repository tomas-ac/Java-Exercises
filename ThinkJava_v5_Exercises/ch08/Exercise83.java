public class Exercise84 {

	public static void main(String[] args) {
		example("banana");
		//countLetters2("banana", 'a');
	}

	public static void example(String s) {
		s = "((3+7) *2)";
		int len = s.length();

		int i = 0;
		int count = 0;

		while (i < len) {
			char c = s.charAt(i);

			if (c == '(') {
				count = count + 1;
			} elese if (c == ')') {
				count = count - 1;
			}
			i = i +1;
		}
		System.out.println(count);
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
	}
} */