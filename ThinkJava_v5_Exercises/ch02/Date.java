// Exercise 2.2

public class Date {

    public static void main(String[] args) {
	String day;
	String month;
	int date, year;

	day = "Friday";
	month = "April";
	date = 22;
	year = 2016;

	System.out.println("American format:");
	System.out.println(day + ", " + month + " " + date + ", " + year +".");

	System.out.println("European format:");
	System.out.println(day + " " + date + " " + month + ", " + year +".");
    }
}
