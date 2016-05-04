// Exercise 3.4

public class Date2 {

    public static void main(String[] args) {

	System.out.println("American format:");
	printAmerican("Friday", 22, "April", 2016);

	System.out.println("European format:");
	printEuropean("Friday", 22, "April", 2016);
    }

    public static void printAmerican(String day, int date, String month, int year) {
    	System.out.println(day + ", " + month + " " + date + ", " + year +".");
    }

    public static void printEuropean(String day, int date, String month, int year) {
    	System.out.println(day + " " + date + " " + month + ", " + year +".");
    }
}
