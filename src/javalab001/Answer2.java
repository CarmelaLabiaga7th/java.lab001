package javalab001;

//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print “bye!” before exiting.
public class Answer2 {
	public static void main(String[] args) {  // Program entry point
	      int number = -2;       // Set the value of "number" here!
	      System.out.println("The number is " + number);
	      if (number%2!=0) {
	         System.out.println("Odd Number");   // even number
	      } else {
	         System.out.println("Even Number");   // odd number
	      }
	      System.out.println("bye!");
	   }

}
