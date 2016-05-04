// Exercise 2.3

public class Time {

    public static void main(String[] args) {
	
	int hour, minute, second;

	hour = 20;
	minute = 34;
	second = 52;

	int secondsSinceMN;
	secondsSinceMN = (((hour * 60) + minute) * 60) + second;

	System.out.println("Number of seconds since midnight:"); // Exercise 2.3.3
	System.out.println( secondsSinceMN );

	int day;
	day = (24*60)*60;

	System.out.println("Number of seconds remaining in the day:"); // Exercise 2.3.4
	System.out.println(day - secondsSinceMN);

	System.out.println("Percentage of the day that has passed:"); // Exercise 2.3.5
	System.out.println(((secondsSinceMN * 100) / day) + "%");
    }
}
