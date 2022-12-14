package javalab001;

//Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "dayNumber" is 0, 1, ..., 6, respectively.  Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
public class Answer4 {
	public static void main(String[] args) {
		int dayNumber = 0;
		System.out.println("Nested If: ");
		if(dayNumber==0) {
			System.out.println("Sunday");
		}else if(dayNumber==1) {
			System.out.println("Monday");
		}else if(dayNumber==2) {
			System.out.println("Tuesday");
		}else if(dayNumber==3) {
			System.out.println("Wednesday");
		}else if(dayNumber==4) {
			System.out.println("Thursday");
		}else if(dayNumber==5) {
			System.out.println("Friday");
		}else if(dayNumber==6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Not a valid day");
		}
		System.out.println("Switch: ");		
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday");
		case 1:
			System.out.println("Monday");
			break; // Don't forget the "break" after each case!
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break; // Don't forget the "break" after each case!
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a valid day");
		}
	}
}
